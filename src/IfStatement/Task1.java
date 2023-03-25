package IfStatement;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        /*Ask user to give you an integer number between 1 and 5
        print out day name for related number
        input -->>1--> Monday
                  2--> Tuesday
                  3--> Wednesday
    */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Pleace enter an integer number between 1 and 5");

        int number = scanner.nextInt();

        if (number == 1) {
            System.out.println("It is Monday");
        }
        if (number == 2) {
            System.out.println("It is Tuesday");

        }
        if (number == 3) {
            System.out.println("It is Wednesday");


        }
        if (number == 4) {
            System.out.println("It is Thursday");

        }

        if (number == 5) {
            System.out.println("It is Friday");


        }
        if (number > 5 || number < 1) {
            System.out.println("there is no matching day for your entry");
        }
    }
    }















