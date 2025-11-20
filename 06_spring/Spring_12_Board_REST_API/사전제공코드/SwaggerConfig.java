package com.ssafy.mvc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@Configuration
public class SwaggerConfig {
	 @Bean
	  public OpenAPI springBoardOpenAPI() {
	      return new OpenAPI()
	              .info(new Info().title("SpringBoard API")
	              .description("Spring Boot Board REST API")
	              .version("v0.0.1")
	              .license(new License().name("SSAFY").url("https://www.ssafy.com")));
	  }
}
