package com.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int swOption;

            Scanner userOption = new Scanner(System.in);
            System.out.println("Please type the function number to run:");
            System.out.println("1 - classChallenge");
            System.out.println("2 - rectangle");
            System.out.println("3 - BankAccount");

            String option = userOption.nextLine();
            System.out.println("You selected option: " + option);
            try{
                swOption = Integer.parseInt(option);
            }catch (Exception e){
                swOption = 0;
            }


        switch(swOption){
            case 1:
                classChallenge[] array = new classChallenge[3];
                array[0] = new classChallenge(1);
                array[1] = new classChallenge(2);
                array[2] = new classChallenge(3);

                for (classChallenge obj : array){
                    System.out.println(obj.getValue1());
                }
            break;
            case 2:
                rectangle rect = new rectangle(5, 3);
                System.out.println(rect.areaCalc());
            break;
            case 3:
                bankAccount davidAccount = new bankAccount("David Hodges",100);
                davidAccount.deposit(50);
                davidAccount.withdraw(30);
                System.out.println("Mr." + davidAccount.getAccHolder() + " Your current Balance is: " + davidAccount.getBalance());
            break;
            default:
                System.out.println("None valid option selected, Exiting Program");
            break;
        }


    }


}