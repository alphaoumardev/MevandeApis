package com.mall4j.cloud.common.exception;

import com.mall4j.cloud.common.response.ResponseEnum;

/**
 * @author Alphaoumardev
 * @date 2020/7/11
 */
public class mevandeException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	private Object object;

	private ResponseEnum responseEnum;

	public mevandeException(String msg) {
		super(msg);
	}

	public mevandeException(String msg, Object object) {
		super(msg);
		this.object = object;
	}

	public mevandeException(String msg, Throwable cause) {
		super(msg, cause);
	}


	public mevandeException(ResponseEnum responseEnum) {
		super(responseEnum.getMsg());
		this.responseEnum = responseEnum;
	}

	public mevandeException(ResponseEnum responseEnum, Object object) {
		super(responseEnum.getMsg());
		this.responseEnum = responseEnum;
		this.object = object;
	}


	public Object getObject() {
		return object;
	}

	public ResponseEnum getResponseEnum() {
		return responseEnum;
	}

}
