package com.example;

public class Main {
    public static void main(String[] args) {

        int option = 1;

        switch(option){
            case 0:
                classChallenge[] array = new classChallenge[3];
                array[0] = new classChallenge(1);
                array[1] = new classChallenge(2);
                array[2] = new classChallenge(3);

                for (classChallenge obj : array){
                    System.out.println(obj.getValue1());
                }
            break;
            case 1:
                rectangle rect = new rectangle(5, 3);
                System.out.println(rect.areaCalc());
            break;
        }


    }


}