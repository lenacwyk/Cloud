package IfStatement;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        /*get a single letter from the user is:
        'M' or 'm' -->>it is Monday
         'T' or 't' -->>it is Tuesday or Thursday
          'W' or 'w' -->>it is Wednesday

         */

        Scanner scanner=new Scanner(System.in);

        System.out.println("Please enter a letter ");

       char letter= scanner.nextLine().charAt(0);

        if(letter=='M' || letter=='m') {
            System.out.println("It is Monday");
        }
        if(letter=='T' || letter=='t') {

            System.out.println("It is Tuesday or Thursday ");
        }

        if (letter=='W' || letter=='w') {
            System.out.println("It is Wednesday");
        }
        //cover the cases when the incoming letter is not one of the expected letters

        if (letter!='M' && letter!='m' && letter!='T' && letter!='t'&&letter!='W'&&letter!='w') {
            System.out.println("Invalid entry");
        }








    }
}
