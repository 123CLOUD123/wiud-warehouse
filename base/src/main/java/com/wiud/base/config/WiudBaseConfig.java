package com.wiud.base.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.wiud.base.core.BillDispatcher;
import com.wiud.base.core.BillDispatcherBuilder;

/**
 * Base system config
 * 
 * @author ZhangHao
 */
@Configuration
public class WiudBaseConfig {

	@Bean
	public BillDispatcher billDispatcherBuilder() {
		return new BillDispatcherBuilder()
					.init()
					.config()
					.result();
	}
	
}
