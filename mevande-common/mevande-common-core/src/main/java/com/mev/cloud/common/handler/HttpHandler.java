package com.mev.cloud.common.handler;

import cn.hutool.core.util.CharsetUtil;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mev.cloud.common.exception.MevandeException;
import com.mev.cloud.common.response.ServerResponseEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author Alphaoumardev
 * @date 2020/7/16
 */
@Component
public class HttpHandler {

	private static final Logger logger = LoggerFactory.getLogger(HttpHandler.class);

	@Autowired
	private ObjectMapper objectMapper;

	public <T> void printServerResponseToWeb(ServerResponseEntity<T> serverResponseEntity) {
		if (serverResponseEntity == null) {
			logger.info("print obj is null");
			return;
		}

		ServletRequestAttributes requestAttributes = (ServletRequestAttributes) RequestContextHolder
				.getRequestAttributes();
		if (requestAttributes == null) {
			logger.error("requestAttributes is null, can not print to web");
			return;
		}
		HttpServletResponse response = requestAttributes.getResponse();
		if (response == null) {
			logger.error("httpServletResponse is null, can not print to web");
			return;
		}
		logger.error("response error: " + serverResponseEntity.getMsg());
		response.setCharacterEncoding(CharsetUtil.UTF_8);
		response.setContentType(MediaType.APPLICATION_JSON_VALUE);
		PrintWriter printWriter = null;
		try {
			printWriter = response.getWriter();
			printWriter.write(objectMapper.writeValueAsString(serverResponseEntity));
		}
		catch (IOException e) {
			throw new MevandeException("io 异常", e);
		}
	}

}
