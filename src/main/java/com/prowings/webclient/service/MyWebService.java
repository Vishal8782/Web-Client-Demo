package com.prowings.webclient.service;

import java.time.Duration;
import java.util.concurrent.ExecutionException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class MyWebService {
	
	
	private final WebClient webClient;

	@Autowired
	public MyWebService(WebClient webClient) {
		this.webClient = webClient;
	}
	
	
	public Mono<String> getHelloCall() 
	{
		return webClient.get()
				.uri("/hello")
				.retrieve()
				.bodyToMono(String.class);

//		res.subscribe(
//		            result -> {
//		                // Print or use the result
//		                System.out.println(result); // This will print "Hello, world!"
//		            },
//		            error -> {
//		                // Handle errors
//		                System.err.println("Error occurred: " + error.getMessage());
//		            }
//		        );
		
	}

	public Flux<String> getHelloListCall() 
	{
		return webClient.get()
				.uri("/hello_list")
				.retrieve()
				.bodyToFlux(String.class);
		
//		res.subscribe(
//		            result -> {
//		                // Print or use the result
//		                System.out.println(result); // This will print "Hello, world!"
//		            },
//		            error -> {
//		                // Handle errors
//		                System.err.println("Error occurred: " + error.getMessage());
//		            }
//		        );
		
	}
	

}