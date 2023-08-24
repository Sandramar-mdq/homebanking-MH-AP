package com.mindhub.homebanking.models;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Transaction {
    @Id
    @GeneratedValue( strategy = GenerationType.AUTO, generator =  "native")
    @GenericGenerator( name = "native", strategy = "native")
    private Long id;
    private double amount;
    private String description;
    private LocalDateTime date;
    private TransactionType Type;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "account")
    private Account account;

    public Transaction() {}

    public Transaction ( double amount, String description, LocalDateTime date, TransactionType type){
        this.amount = amount;
        this.description = description;
        this.date = date;
        this.Type = type;
    }

    public Long getId() {
        return id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public TransactionType getType() {
        return Type;
    }

    public void setType(TransactionType type) {
        Type = type;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
