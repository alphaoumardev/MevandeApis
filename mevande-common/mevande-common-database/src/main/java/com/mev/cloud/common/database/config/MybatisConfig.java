package com.mev.cloud.common.database.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author Alphaoumardev
 * @date 2020/6/24
 */
@Configuration
@MapperScan({ "com.mev.cloud.**.mapper" })
public class MybatisConfig {


}
