package it.itsrizzoli.auctive;

import it.itsrizzoli.auctive.dao.UserRepository;
import it.itsrizzoli.auctive.model.User;
import org.apache.catalina.Store;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AuctionApplication implements CommandLineRunner {
	@Autowired
	UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(AuctionApplication.class, args);
	}

    @Override
    public void run(String... args) {
		User user = new User("Mario", "Rossi", "mariorossi@gmail.com", "m@r.it", "password", 1, "aaaaaaa");
		userRepository.save(user);
	}
}
