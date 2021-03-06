package com.daugherty;

public class Main {
    public static void main(String[] args) {
        int yearOfCreation = 2012;
        double balance = 600000;
        Account sampleAccount = new Account(yearOfCreation, balance);
        double currentInterestRate = sampleAccount.getInterestRate();

        System.out.println("Your account was created in " + yearOfCreation + " and has a balance of " + balance);
        System.out.println("Its current interest rate is " + currentInterestRate + "%");
    }
}
