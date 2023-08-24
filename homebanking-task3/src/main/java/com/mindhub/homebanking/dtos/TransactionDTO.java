package com.mindhub.homebanking.dtos;

import com.mindhub.homebanking.models.Transaction;
import com.mindhub.homebanking.models.TransactionType;

import java.time.LocalDateTime;

public class TransactionDTO {
    private Long id;
    private double amount;
    private String description;
    private LocalDateTime date;
    private TransactionType Type;

    public TransactionDTO(Transaction transaction) {
    }

    public Long getId() {
        return id;
    }

    public double getAmount() {
        return amount;
    }

    public String getDescription() {
        return description;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public TransactionType getType() {
        return Type;
    }
}
