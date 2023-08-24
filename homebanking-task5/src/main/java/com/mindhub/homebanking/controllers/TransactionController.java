package com.mindhub.homebanking.controllers;

import com.mindhub.homebanking.dtos.TransactionDTO;
import com.mindhub.homebanking.models.Transaction;
import com.mindhub.homebanking.repositories.TransactionRepository;
import net.minidev.json.annotate.JsonIgnore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static java.util.stream.Collectors.toList;

@RestController
@RequestMapping("/api")
public class TransactionController {

    @Autowired
    private TransactionRepository transactionRepository;

    @JsonIgnore
    @RequestMapping("/transactions")
    public List<Transaction> getTransactions() {
        return transactionRepository.findAll().stream().map(Transaction::new).collect(toList());
    }

    @RequestMapping("/transactions/{id}")
    public TransactionDTO getTransaction(@PathVariable Long id){

        TransactionDTO transaction = new TransactionDTO(transactionRepository.findById(id).orElse(null));
        return transaction;


    }

}
