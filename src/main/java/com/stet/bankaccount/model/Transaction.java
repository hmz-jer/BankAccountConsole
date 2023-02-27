package com.stet.bankaccount.model;

import java.util.Date;

public class Transaction {

    private Date date;
    private double amount;
    private double balance;
    private String type;

    public Transaction(Date date, double amount, double balance, String type) {
        this.date = date;
        this.amount = amount;
        this.balance = balance;
        this.type = type;
    }

    public Date getDate() {
        return date;
    }

    public double getAmount() {
        return amount;
    }

    public double getBalance() {
        return balance;
    }

    public String getType() {
        return type;
    }
}