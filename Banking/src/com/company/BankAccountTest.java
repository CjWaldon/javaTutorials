package com.company;

import static org.junit.Assert.*;

public class BankAccountTest {
    private BankAccount account;
    private static int cnt;

    @org.junit.BeforeClass
    public static void beforeClass(){
        System.out.println("this happens before tests. Count = "+cnt++);
    }

    @org.junit.Before
    public void setup(){
        account = new BankAccount("Tim", "Buchalka", 1000.00, BankAccount.CHECKING);
        System.out.println("Running a test...");
    }

    @org.junit.Test
    public void deposit() {
        double balance = account.deposit(200.00, true);
        assertEquals(1200, account.getBalance(),0);
    }

    @org.junit.Test
    public void withdraw_branch() {
        double balance = account.withdraw(600.00, true);
        assertEquals(400, balance,0);
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void withdraw_notBranch() {
        double balance = account.withdraw(600.00, false);
        assertEquals(400, balance,0);
    }

    @org.junit.Test
    public void getBalance_deposit() {
        account.deposit(200.00, true);
        assertEquals(1200, account.getBalance(),0);
    }

    @org.junit.Test
    public void getBalance_withdraw() {
        account.withdraw(200.00, true);
        assertEquals(800, account.getBalance(),0);
    }

    @org.junit.Test
    public void isChecking_true(){

        assertTrue("Account is NOT a checking account", account.isChecking());
    }

    @org.junit.AfterClass
    public static void afterClass(){
        System.out.println("this happens after tests. Count = "+cnt++);
    }

    @org.junit.After
    public void teardown(){
        System.out.println("Count = "+cnt++);
    }

}