package com.tdtech.scorecard.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"com.tdtech.scorecard.api.bow.controller", "com.tdtech.scorecard.api.bow.service", "com.tdtech.scorecard.api.round.controller","com.tdtech.scorecard.api.round.service"})
@EntityScan({"com.tdtech.scorecard.api.bow.entity","com.tdtech.scorecard.api.round.entity"})
@EnableJpaRepositories({"com.tdtech.scorecard.api.bow.repository","com.tdtech.scorecard.api.round.repository"})
public class ApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);
	}

}
