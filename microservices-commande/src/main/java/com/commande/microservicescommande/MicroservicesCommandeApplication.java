package com.commande.microservicescommande;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
 public class MicroservicesCommandeApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicesCommandeApplication.class, args);
	}

}
