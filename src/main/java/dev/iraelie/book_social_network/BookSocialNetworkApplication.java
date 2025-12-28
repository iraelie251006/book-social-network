package dev.iraelie.book_social_network;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class BookSocialNetworkApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookSocialNetworkApplication.class, args);
	}

}
