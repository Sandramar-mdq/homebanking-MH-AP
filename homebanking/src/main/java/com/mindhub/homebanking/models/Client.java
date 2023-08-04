package com.mindhub.homebanking.models;

import org.springframework.data.annotation.Id;
import javax.persistence.Entity;

@Entity
public class Client {
    @Id
    private String id;
    private String firstName;
    private String lastName;

    public Client (){}

    public Client (String id, String firstName, String lastName){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getId() {
        return id;
    }

     public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
