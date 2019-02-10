package com.dietcontroller.dietcontrollerweb.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@MapperScan("com.dietcontroller.dietcontrollerweb.dao")
@EnableTransactionManagement
public class PersistenceConfig {

}