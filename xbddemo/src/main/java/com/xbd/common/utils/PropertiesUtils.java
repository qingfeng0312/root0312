package com.xbd.common.utils;

import java.util.Properties;


/**
 * @author hehuannan
 * @since 2018-03-16
 * @desc 加载配置文件
 */
public class PropertiesUtils {
	public static Properties props = new Properties();
	static {
		try {
			props.load(PropertiesUtils.class.getClassLoader()
					.getResourceAsStream("config.properties"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static String getProperty(String key) {
		return props.getProperty(key);
	}
	
}
