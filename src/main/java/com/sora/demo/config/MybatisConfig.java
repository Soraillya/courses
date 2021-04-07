package com.sora.demo.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.sora.demo.mbg.mapper")
public class MybatisConfig {
}
