package com.example.biometria.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.example.biometria"})
public class BiometriaApplication {

	public static void main(String[] args) {
		SpringApplication.run(BiometriaApplication.class, args);
	}

}
