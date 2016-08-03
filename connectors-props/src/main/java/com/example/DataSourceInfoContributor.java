package com.example;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.info.Info;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class DataSourceInfoContributor implements InfoContributor {

	private DataSource dataSource;

	@Autowired
	public DataSourceInfoContributor(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	@Override
	public void contribute(Info.Builder builder) {
		Map<String, String> info = new HashMap<>();
		info.put("url", dataSource.getUrl());
		info.put("driver", dataSource.getDriverClassName());

		builder.withDetail("dataSource", info);
	}

}