package com.xbd.common.utils;

import java.util.Properties;


/**
 * 
 * @author lishen
 * @since 20150417
 * @desc 加载配置文件
 */
public class PropertiesUtils {
	public static Properties props = new Properties();
	public static Properties codes = new Properties();//存储的错误码
	public static Properties zntUrl = new Properties();//存储的地址编码
	static {
		try {
			props.load(PropertiesUtils.class.getClassLoader()
					.getResourceAsStream("config.properties"));
			codes.load(PropertiesUtils.class.getClassLoader()
					.getResourceAsStream("error_code.properties"));
			zntUrl.load(PropertiesUtils.class.getClassLoader().getResourceAsStream("znt_url.properties"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static String getProperty(String key) {
		return props.getProperty(key);
	}
	public static String getPropertyZnt(String key) {
		return zntUrl.getProperty(key);
	}
	public static String getErrorCode(String key) {
		String code = "";
		try {
			code = codes.getProperty(key);
			if (!StringUtils.isEmpty(code)) {
				code = new String(code.getBytes("ISO-8859-1"),"utf-8");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return code;
	}
	
	public static void main(String[] args) {
		System.out.println(PropertiesUtils.getProperty("goods.list.pageSize"));
		System.out.println("我");
		System.out.println(PropertiesUtils.getErrorCode("100001"));
	}
}
