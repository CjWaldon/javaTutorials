package com.company;

public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer("Tim", 54.96);
        Customer anotherCustomer = customer; //memory address assignment, not copying.
        anotherCustomer.setBalance(12.18);
        System.out.println("balance for customer "+ customer.getName()+" is "+customer.getBalance());
    }
}
