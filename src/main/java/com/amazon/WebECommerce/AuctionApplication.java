package com.amazon.WebECommerce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


//upload file


@SpringBootApplication
public class AuctionApplication implements CommandLineRunner {
	/*
	@Autowired
    //private UserDao userRepository;

	@Autowired
	private ProductDao productRepository;
    
	@Autowired
	private CartDao cartRepository;
	*/
	
	public static void main(String[] args) {
		SpringApplication.run(AuctionApplication.class, args);
	}

    @Override
    public void run(String... args) {
        /*Product p1 = productRepository.findById(2);
        Product p2 = productRepository.findById(3);

        User u = userRepository.findById(4);

        Cart c = new Cart();
        c.setCliente(u);
        c.setAcquistoData(new Date());
        c.setProdotto(p1);
        cartRepository.save(c);

        Cart c1 = new Cart();
        c1.setCliente(u);
        c1.setAcquistoData(new Date());
        c1.setProdotto(p2);
        cartRepository.save(c1);*/

    	/*List<Cart> carts = cartRepository.findByClienteId(4L);
    	System.out.print("");

    	User u2 = userRepository.findById(2L);
    	carts.get(0).setCliente(u2);

    	cartRepository.save(carts.get(0));


    	prova commit Jimwell*/
    }
}
