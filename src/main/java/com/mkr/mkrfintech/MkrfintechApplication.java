package com.mkr.mkrfintech;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MkrfintechApplication {

	public static void main(String[] args) {
		String branch="main";
		String subBranch="feature";

		SpringApplication.run(MkrfintechApplication.class, args);

	}

}
