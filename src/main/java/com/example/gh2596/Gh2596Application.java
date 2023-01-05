package com.example.gh2596;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Supplier;

@SpringBootApplication
public class Gh2596Application {

	public static void main(String[] args) {
		SpringApplication.run(Gh2596Application.class, args);
	}

	@Bean
	public Supplier<String> outputChannel() {
		return () -> "foo";
	}

}
