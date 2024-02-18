package com.mev.cloud.search;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author Alphaoumardev
 * @date 2020/09/24
 */
@SpringBootApplication(scanBasePackages = { "com.mev.cloud" })
@EnableFeignClients(basePackages = {"com.mev.cloud.api.**.feign"})
public class SearchApplication {

	public static void main(String[] args) {
		SpringApplication.run(SearchApplication.class, args);
	}

}
