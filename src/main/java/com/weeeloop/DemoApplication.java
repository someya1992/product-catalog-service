package com.weeeloop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

//@EnableDiscoveryClient

//@EnableFeignClients
@SpringBootApplication
public class DemoApplication {

	
	//@LoadBalanced
	@Bean
	public RestTemplate getRestTemplate()
	{
		RestTemplate template = new RestTemplate();
		//template.setRequestFactory(new HttpComponentsClientHttpRequestFactory());
		return template;
	}
	
	public WebClient.Builder getWebClientBuilder()
	{
		return WebClient.builder();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
