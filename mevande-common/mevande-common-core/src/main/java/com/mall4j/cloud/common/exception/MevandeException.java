package com.mall4j.cloud.common.exception;

import com.mall4j.cloud.common.response.ResponseEnum;

import java.io.Serial;

/**
 * @author Alphaoumardev
 * @date 2020/7/11
 */
public class MevandeException extends RuntimeException
{

	@Serial
	private static final long serialVersionUID = 1L;

	private Object object;

	private ResponseEnum responseEnum;

	public MevandeException(String msg) {
		super(msg);
	}

	public MevandeException(String msg, Object object) {
		super(msg);
		this.object = object;
	}

	public MevandeException(String msg, Throwable cause) {
		super(msg, cause);
	}


	public MevandeException(ResponseEnum responseEnum) {
		super(responseEnum.getMsg());
		this.responseEnum = responseEnum;
	}

	public MevandeException(ResponseEnum responseEnum, Object object) {
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
