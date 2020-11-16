package com.kodilla.edgeserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class KodillaEdgeServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(KodillaEdgeServerApplication.class, args);
	}

}
