package com.stet.bankaccount.service;

import com.stet.bankaccount.model.Transaction;
import org.junit.jupiter.api.Test;


import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BankAccountTest {

    @Test
    public void testDeposit() {
        BankAccount account = new BankAccount();
        account.deposit(1000);
        assertEquals(1000, account.getBalance(), 0.001);
    }

    @Test
    public void testWithdraw() {
        BankAccount account = new BankAccount();
        account.deposit(1000);
        account.withdraw(500);
        assertEquals(500, account.getBalance(), 0.001);
    }

    @Test
    public void testWithdrawInsufficientBalance() {
        BankAccount account = new BankAccount();
        account.deposit(1000);
        assertThrows(IllegalArgumentException.class, () -> account.withdraw(2000));
    }

    @Test
    public void testPrintStatement() {
        BankAccount account = new BankAccount();
        account.deposit(1000);
        account.withdraw(500);
        account.deposit(2000);
        List<Transaction> transactions = account.getTransactions();
        assertEquals(3, transactions.size());
        Transaction t1 = transactions.get(0);
        assertEquals(1000, t1.getAmount(), 0.001);
        assertEquals(1000, t1.getBalance(), 0.001);
        assertEquals("Deposit", t1.getType());
        Transaction t2 = transactions.get(1);
        assertEquals(-500, t2.getAmount(), 0.001);
        assertEquals(500, t2.getBalance(), 0.001);
        assertEquals("Withdrawal", t2.getType());
        Transaction t3 = transactions.get(2);
        assertEquals(2000, t3.getAmount(), 0.001);
        assertEquals(2500, t3.getBalance(), 0.001);
        assertEquals("Deposit", t3.getType());
    }
}
