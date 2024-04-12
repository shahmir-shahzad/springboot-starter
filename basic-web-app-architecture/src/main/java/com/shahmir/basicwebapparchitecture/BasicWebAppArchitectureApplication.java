package com.shahmir.basicwebapparchitecture;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpMethod;

import java.net.http.HttpRequest;

@SpringBootApplication
public class BasicWebAppArchitectureApplication {

	public static void main(String[] args) {
		SpringApplication.run(BasicWebAppArchitectureApplication.class, args);
		System.out.println("Web server has been started");
	}

}
