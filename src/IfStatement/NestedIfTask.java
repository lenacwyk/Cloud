package IfStatement;

import java.util.Locale;
import java.util.Scanner;

public class NestedIfTask {
    public static void main(String[] args) {
        /*
        ask for city
        if the city is -->>CHICAGO
        *what is your scool name?
        if scool is Techtorial -->> you are lucky to have EFE!
        if your scool is not Techtorial -->> please come to Chicago and visit us!

         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pleace enter your city name ");
        String city = scanner.nextLine();

        city = city.toLowerCase();
        if (city.equals("chicago")) {
            System.out.println("What is your school name? ");
            String school = scanner.nextLine();

            if (school.equalsIgnoreCase("techtorial")) {
                System.out.println("You are lucky");
            } else {
                System.out.println("please come and visit TECHTORIAL!");
            }
        }else {
            System.out.println("please come to CHICAGO and visit us!");
        }










    }
}
