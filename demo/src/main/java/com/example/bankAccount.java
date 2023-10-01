package com.example;

public class bankAccount {
    private String accHolder;
    private double balance;

    public bankAccount(String a, double b){
        accHolder = a;
        balance = b;
    }

    public void deposit(double amount){
        balance += amount;
    }

    public void withdraw(double amount){
        if(amount <= balance){
            balance -= amount;
        }else{
            System.out.println("insufficient funds");
        }
    }

    public double getBalance(){
        return balance;
    }


}
