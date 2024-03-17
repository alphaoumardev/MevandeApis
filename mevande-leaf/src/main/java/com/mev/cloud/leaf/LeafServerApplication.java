package com.mev.cloud.leaf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author Alphaoumardev
 */
@SpringBootApplication(scanBasePackages = { "com.mev.cloud" })
@EnableFeignClients(basePackages = {"com.mev.cloud.api.**.feign"})
public class LeafServerApplication
{
	public static void main(String[] args) {
		SpringApplication.run(LeafServerApplication.class, args);
	}
}
