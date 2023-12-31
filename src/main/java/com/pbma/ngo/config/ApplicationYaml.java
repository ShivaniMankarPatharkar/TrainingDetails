package com.pbma.ngo.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Data;


@Configuration
@ConfigurationProperties("app")
@Data
public class ApplicationYaml {

	private Jolt jolt;

	@Data
	public static class Jolt {
		private String trainingDetailsRequestJoltSpec;
		private String trainingDetailsGetResponseJoltSpec;
		private String trainingDetailsPostResponseJoltSpec;
	}
	
}
