package com.mkr.mkrfintech;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MkrfintechApplication {

	public static void main(String[] args) {
		String branch="main";

		String subBranch="feature";
		String message="changes from feature-0001 merging into feature branch ";
		SpringApplication.run(MkrfintechApplication.class, args);

	}

}
