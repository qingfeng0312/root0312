package com.xbd.common.utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;

public class JSONUtils {

	public static <T> T jsonStrToBean(String jsonStr, Class<T> beanClass) {
		if (null == jsonStr || "".equals(jsonStr.trim()) || null == beanClass) {
			return null;
		} else {
			return JSON.parseObject(jsonStr, beanClass);
		}
	}

	public static JSONObject parseObject(String jsonStr) {
		if (null == jsonStr || "".equals(jsonStr.trim())) {
			return null;
		} else {
			return JSON.parseObject(jsonStr);
		}
	}
	

    /**
     * javaBean转换为JSON字符串
     * 支持List<T>或T
     * @param resultBean
     * @return
     */
    public static <T> String beanToJSONStr(T bean){
        if(null == bean){
            return null;
        }else{
            return JSONObject.toJSONString(bean, SerializerFeature.DisableCircularReferenceDetect);
        }
    }

}
