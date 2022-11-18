package com.example.demo.models;

import javax.persistence.*;

@Entity
@Table(name = "beneficiaries")
public class BeneficiarioModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private int id;
    private String fullName;
    private String cardNumber;
    private float balance;

    public void setId(int id) {
        this.id = id;
    }
    public int getId(){
        return id;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public String getFullName(){
        return fullName;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber= cardNumber;
    }
    public String getCardNumber(){
        return cardNumber;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }
    public float getBalance(){
        return balance;
    }
}
