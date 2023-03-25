package IfStatement;

import java.util.Scanner;

public class ElseTask2 {
    public static void main(String[] args) {

        /*get the amount of purchase from user as Dollar amount
        when the amount is $1000-->>give user 20% discount and show final payment amount after discount applied

        less than $1000-->> give user 5% discount and show final payment amount after discount applied

        20% discount calculation -->> amount * .20
        5% discount calculation -->> amount * .05
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("How much is your spending?");

        double amount =scanner.nextDouble();

        System.out.println( "What is your state?");
        String state = scanner.nextLine();
        double tax = 0;

        if (state.equalsIgnoreCase("th") || state.equalsIgnoreCase("texas")){
        tax = amount * 0.045;}



        if (amount >= 1000) {

         double discount1 =   amount * 0.20;
         amount = (amount - discount1)+ tax;

            System.out.println( "Your savings is:" + discount1);
            System.out.println("Your payment after 20% discount is: " + amount);
           } else {
            double discount2 = amount * 0.05;
            amount = (amount - discount2) + tax;
            System.out.println( "Your savings is:" + discount2);
            System.out.println("Your paymant after 5% discount is: " + amount);
        }

        /*charge some tax
        if shoping is happening in the state of TH
        charge 4.5 % tax and add it to the final payment
         */







        }







    }


