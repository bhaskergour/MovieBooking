package com.tiketbookings;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class TiketbookingsApplication {

	public static void main(String[] args) {
		SpringApplication.run(TiketbookingsApplication.class, args);
	}

}
