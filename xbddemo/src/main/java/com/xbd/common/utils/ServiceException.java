package com.xbd.common.utils;

import java.text.MessageFormat;


/**
 * @author hehuannan
 * @since 2018-03-16
 * 类说明：业务检查异常类
 */
public class ServiceException extends RuntimeException{
	private static final long serialVersionUID = 1L;
	private String code;
	private String msg;
	public ServiceException() {
        super();
    }
    
    public ServiceException(String code) {
      //  super(PropertiesUtils.getErrorCode(code));
        this.code = code;
      //  this.msg = PropertiesUtils.getErrorCode(code);
    }
    
    public ServiceException(Throwable cause) {
        super(cause);
    }
    
    
    public ServiceException(String code,Throwable e){
		//super(PropertiesUtils.getErrorCode(code), e);
		this.code = code;
		//this.msg = PropertiesUtils.getErrorCode(code);
	}
    
    public ServiceException(String code,Throwable e,Object... args){
		//super(MessageFormat.format(PropertiesUtils.getErrorCode(code), args), e);
		this.code = code;
		//this.msg = PropertiesUtils.getErrorCode(code);
		this.msg = MessageFormat.format(this.msg, args);
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
    
}