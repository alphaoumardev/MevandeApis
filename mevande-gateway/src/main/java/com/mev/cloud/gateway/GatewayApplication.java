package com.mev.cloud.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Alphaoumardev
 * @date 2020/7/23
 */
@SpringBootApplication(scanBasePackages = { "com.mev.cloud" })
public class GatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayApplication.class, args);
	}

}
