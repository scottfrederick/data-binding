package com.example.config;

import org.springframework.cloud.config.java.AbstractCloudConfig;
import org.springframework.cloud.service.PooledServiceConnectorConfig;
import org.springframework.cloud.service.relational.DataSourceConfig;
import org.springframework.cloud.service.relational.DataSourceConfig.ConnectionConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DatabaseConfig extends AbstractCloudConfig {
	@Bean
	public DataSource dataSource() {
		PooledServiceConnectorConfig.PoolConfig poolConfig = new PooledServiceConnectorConfig.PoolConfig(2, 10, 60000);
		ConnectionConfig connectionConfig = new ConnectionConfig("useUnicode=yes;characterEncoding=UTF-8");
		DataSourceConfig config = new DataSourceConfig(poolConfig, connectionConfig);
		return connectionFactory().dataSource(config);
	}
}
