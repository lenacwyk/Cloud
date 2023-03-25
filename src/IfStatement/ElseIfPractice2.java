package IfStatement;

import java.util.Scanner;

public class ElseIfPractice2 {
    public static void main(String[] args) {

           /* TASK
            get an integer number from user
            check and print out if the given number is positive number, negative number or zero
             */


        System.out.println("enter an integer number");
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();

        if ( number < 0 ) {

            System.out.println(" Your number is negative");
        } else if (number > 0) {
            System.out.println("Your number is positive");
        }else
            System.out.println("Your number must be ZERO");
        System.out.println("****");
        System.out.println("***********");

        }
    }


