package com.stet.bankaccount.service;

import com.stet.bankaccount.model.Transaction;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BankAccount {

    private double balance;
    private List<Transaction> transactions;

    public BankAccount() {
        balance = 0;
        transactions = new ArrayList<Transaction>();
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Invalid amount");
        }
        balance += amount;
        transactions.add(new Transaction(new Date(), amount, balance, "Deposit"));
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Invalid amount");
        }
        if (balance < amount) {
            throw new IllegalArgumentException("Insufficient balance");
        }
        balance -= amount;
        transactions.add(new Transaction(new Date(), -amount, balance, "Withdrawal"));
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public double getBalance() {
        return balance;
    }

    public void printStatement() {
        System.out.println("Date\t\t\tAmount\tBalance\t\tType");
        for (Transaction t : transactions) {
            System.out.println(t.getDate() + "\t" + t.getAmount() + "\t" + t.getBalance() + "\t" + t.getType());
        }
    }
}