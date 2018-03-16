package com.xbd.common.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import net.sourceforge.pinyin4j.PinyinHelper;
import net.sourceforge.pinyin4j.format.HanyuPinyinCaseType;
import net.sourceforge.pinyin4j.format.HanyuPinyinOutputFormat;
import net.sourceforge.pinyin4j.format.HanyuPinyinToneType;
import net.sourceforge.pinyin4j.format.exception.BadHanyuPinyinOutputFormatCombination;

public class StringUtils {
	/**
	 * 对字符串左补充目标串
	 * 
	 * @param src
	 *            源字符串
	 * @param target
	 *            目标字符串
	 * @param length
	 *            结果字符串长度
	 * @return
	 */
	public static String appendLeftSub(String src, int length, String target) {
		StringBuffer sb = new StringBuffer();
		if (src != null && target != null) {
			int a = (length - src.length()) / target.length();
			int b = (length - src.length()) % target.length();
			if (src.length() <= length) {
				for (int i = 0; i < (b != 0 ? a + 1 : a); i++) {
					sb.append(target);
				}
			}
			sb.append(src);
			System.out.println(sb);
			return sb.substring(sb.length() - length);
		}
		return null;
	}

	/**
	 * 判断字符串是否为空
	 * 
	 * @param src
	 * @return
	 * @author lishen
	 * @date 2015-5-1
	 */
	public static boolean isEmpty(String src) {
		if (src == null || src.length() == 0) {
			return true;
		}
		return false;
	}

	/**
	 * 求子串在父串中出现的次数 使用此方法后，请及时清除count的值为0,count为全局变量，
	 * 
	 * @auther lishen
	 * @date 2015-7-30
	 */
	public static int repeatCount(String parent, String children) {
		int count = 0;
		int length = parent.indexOf(children);
		while (length != -1) {
			parent = parent.substring(length + children.length());
			count++;
			length = parent.indexOf(children);
		}
		return count;
	}

	public static String inputStream2String(InputStream in) throws IOException {
		StringBuffer out = new StringBuffer();
		byte[] b = new byte[4096];
		for (int n; (n = in.read(b)) != -1;) {
			out.append(new String(b, 0, n));
		}
		return out.toString();
	}

	/**
	 * 判断字符串是否为（空格 ,"" ,null)
	 * 
	 * @param str
	 * @author jiachenyu
	 */
	public static boolean isBlank(String str) {
		int strLen;
		if (str == null || (strLen = str.length()) == 0) {
			return true;
		}
		for (int i = 0; i < strLen; i++) {
			if ((Character.isWhitespace(str.charAt(i)) == false)) {
				return false;
			}
		}
		return true;
	}

	/**
	 * 判断字符串是否只为大小写字母和数字
	 */
	public static boolean is_alpha(String alpha) {
		if (alpha == null)
			return false;
		return alpha.matches("^[a-zA-Z]{5}\\d{5}$");
	}

	/**
	 * 判断字符串是否只为数字
	 */
	public static boolean isNumber(String number) {
		if (number == null)
			return false;
		return number.matches("[+-]?[1-9]+[0-9]*(\\.[0-9]+)?");
	}

	/**
	 * 获取字符串汉字首字母+英文字符
	 */
	public static String defaultName(String shopNameStr) {
		if (!StringUtils.isEmpty(shopNameStr)) {
			String chinaStr = getChineseStr(shopNameStr);
			StringBuilder sb = new StringBuilder();
			if (!StringUtils.isEmpty(chinaStr)) {
				for (int i = 0; i < chinaStr.length(); i++) {
					String charAt = chinaStr.charAt(i) + "";
					String toPinyin = ToPinyin(charAt);
					if (!StringUtils.isEmpty(toPinyin)) {
						sb.append(toPinyin.charAt(0));
					}
				}
			}
			String englishStr = getEnglishStr(shopNameStr);
			if(!StringUtils.isEmpty(englishStr)){
				sb.append(englishStr.toLowerCase());
			}
			return sb.toString();
		}
		return null;
	}

	public static String getChineseStr(String paramValue) {
		String regex = "([\u4e00-\u9fa5]+)";
		String str = "";
		Matcher matcher = Pattern.compile(regex).matcher(paramValue);
		while (matcher.find()) {
			str += matcher.group(0);
		}
		return str;
	}

	public static String getEnglishStr(String paramValue) {
		String regex = "([a-zA-Z])";
		String str = "";
		Matcher matcher = Pattern.compile(regex).matcher(paramValue);
		while (matcher.find()) {
			str += matcher.group(0);
		}
		return str;
	}

	/**
	 * 汉字转为拼音
	 * 
	 * @param chinese
	 * @return
	 */
	public static String ToPinyin(String chinese) {
		String pinyinStr = "";
		char[] newChar = chinese.toCharArray();
		HanyuPinyinOutputFormat defaultFormat = new HanyuPinyinOutputFormat();
		defaultFormat.setCaseType(HanyuPinyinCaseType.LOWERCASE);
		defaultFormat.setToneType(HanyuPinyinToneType.WITHOUT_TONE);
		for (int i = 0; i < newChar.length; i++) {
			if (newChar[i] > 128) {
				try {
					pinyinStr += PinyinHelper.toHanyuPinyinStringArray(
							newChar[i], defaultFormat)[0];
				} catch (BadHanyuPinyinOutputFormatCombination e) {
					e.printStackTrace();
				}
			} else {
				pinyinStr += newChar[i];
			}
		}
		return pinyinStr;
	}
}
