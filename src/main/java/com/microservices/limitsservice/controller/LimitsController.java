package com.microservices.limitsservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.limitsservice.configuration.LimitServicesConfiguration;
import com.microservices.limitsservice.model.Limits;

@RestController
public class LimitsController {

	@Autowired
	private LimitServicesConfiguration limitServiceConfiguration;

	@GetMapping("/limits")
	public Limits getLimit() {

		return new Limits(limitServiceConfiguration.getMinimum(), 
				limitServiceConfiguration.getMaximum());

	}
}
