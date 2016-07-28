package com.example.config;

import org.springframework.cloud.config.java.AbstractCloudConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DatabaseConfig extends AbstractCloudConfig {
	@Bean
	public DataSource dataSource() {
		return connectionFactory().dataSource();
	}
}
