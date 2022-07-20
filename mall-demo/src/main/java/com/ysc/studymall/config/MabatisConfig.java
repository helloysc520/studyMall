package com.ysc.studymall.config;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.ysc.studymall.mbg.mapper")
public class MabatisConfig {
}
