package com.main.swaggerconfiguration;

import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataClSwaggerConfiguration
{
	@Bean
	public GroupedOpenApi controllerApi()
	{
	        return GroupedOpenApi.builder()
	                .group("DataCollection-Api")
	                .packagesToScan("com.main.controller") // Specify the package to scan
	                .build();
	 }


}
