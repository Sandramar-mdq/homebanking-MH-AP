package com.mindhub.homebanking;

import com.mindhub.homebanking.models.Client;
import com.mindhub.homebanking.repositories.ClientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class HomebankingApplication {

	public static void main(String[] args) {
		SpringApplication.run(HomebankingApplication.class, args);
	}

	@Bean
	public CommandLineRunner initData(ClientRepository clientRepository){
		return (args -> {

			Client client1 = new Client();
			client1.setFirstName("Homero");
			client1.setLastName("Simpson");

			Client client2 = new Client("11-1", "Juan", "Perez");
			Client client3 = new Client("22-2", "Maria", "Rios");

			clientRepository.save(client1);
			clientRepository.save(client2);
			clientRepository.save(client3);

		});
	}
}
