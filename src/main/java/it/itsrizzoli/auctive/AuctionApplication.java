package it.itsrizzoli.auctive;

import it.itsrizzoli.auctive.controllers.AuctionController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AuctionApplication implements CommandLineRunner {
    private static final Logger log = LoggerFactory.getLogger(AuctionController.class);
	public static void main(String[] args) {
		SpringApplication.run(AuctionApplication.class, args);
	}

    @Override
    public void run(String... args) {}
}
