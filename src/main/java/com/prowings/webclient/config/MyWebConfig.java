package com.prowings.webclient.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class MyWebConfig {

	@Bean
	public WebClient webClient()
	{
		WebClient webClient = WebClient.create("http://localhost:8080");
		return webClient;
	}	
		
	
}
