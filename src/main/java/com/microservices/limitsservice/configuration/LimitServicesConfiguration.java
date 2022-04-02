package com.microservices.limitsservice.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
@ConfigurationProperties("limit-service")
public class LimitServicesConfiguration {
	private int minimum;
	private int maximum;
}
