package com.mindhub.homebanking;

import com.mindhub.homebanking.models.Account;
import com.mindhub.homebanking.models.Client;
import com.mindhub.homebanking.models.Transaction;
import com.mindhub.homebanking.models.TransactionType;
import com.mindhub.homebanking.repositories.AccountRepository;
import com.mindhub.homebanking.repositories.ClientRepository;
import com.mindhub.homebanking.repositories.TransactionRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

@SpringBootApplication
public class HomebankingApplication {

	public static void main(String[] args) {
		SpringApplication.run(HomebankingApplication.class, args);
	}

	@Bean
	public CommandLineRunner initData(ClientRepository clientRepository, AccountRepository accountRepository,
									  TransactionRepository transactionRepository){
		return (args -> {

			Client client1 = new Client();
			client1.setFirstName("Melba");
			client1.setLastName("Morel");
			client1.setEmail("melba@minhub.com");

			Client client2 = new Client("Juan", "Perez", "homer@mindhub.com");
			Client client3 = new Client("Maria", "Rios", "marios@minhub.com");

			clientRepository.save(client1);
			clientRepository.save(client2);
			clientRepository.save(client3);

			Account account1 = new Account("VIN001", LocalDate.now(), 5000.0);
			Account account2 = new Account( "VIN002", LocalDate.now().plus(Period.ofDays(1)), 7500.0);

			client1.addAccount(account1);
			client1.addAccount(account2);

			accountRepository.save(account1);
			accountRepository.save(account2);

			Transaction transaction1 = new Transaction( 5000.0, "description 1", LocalDateTime.now(), TransactionType.CREDITO );
			Transaction transaction2 = new Transaction( 1000.0, "description 2", LocalDateTime.now().plusDays(2), TransactionType.DEBITO );


			transactionRepository.save(transaction1);
			transactionRepository.save(transaction2);




		});
	}
}
