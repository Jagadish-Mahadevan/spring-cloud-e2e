package io.schultz.dustin.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.schultz.dustin.service.DemoService;

@Configuration
public class AdiitionalConfiguration {

	@Bean
	public DemoService demoService() {
		return new DemoService();
	}
}