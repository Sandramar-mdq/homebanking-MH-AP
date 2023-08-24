/*
package com.mindhub.homebanking.controllers;

import com.mindhub.homebanking.dtos.TransactionDTO;
import com.mindhub.homebanking.repositories.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TransactionController {

    @Autowired
    private TransactionRepository transactionRepository;


    @RequestMapping("/transactions/{id}")
    public TransactionDTO getTransaction(@PathVariable Long id){

        TransactionDTO transaction = new TransactionDTO(transactionRepository.findById(id).orElse(null));
        return transaction;


    }


}

 */
