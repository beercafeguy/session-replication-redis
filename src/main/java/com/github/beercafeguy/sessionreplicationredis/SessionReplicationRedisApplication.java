package com.github.beercafeguy.sessionreplicationredis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class SessionReplicationRedisApplication {

	public static void main(String[] args) {
		SpringApplication.run(SessionReplicationRedisApplication.class, args);
	}
}
