package IfStatement;

import java.util.Scanner;

public class ElseTask {
    public static void main(String[] args) {

        /*TASK
            ask  user if they have drivers license

            if the answer is 'YES'-->> you are great
            if the ansver is somethingelse-->>DMV is next door, please visit!
             */
        System.out.println( "Do you have drivers's licence? yes/no");

        Scanner input = new Scanner(System.in);
        String answer = input.nextLine();

        if (answer.equalsIgnoreCase("yes")) {

            System.out.println("you are great!");
        }else{

            System.out.println("DMV is next door, please visit!");






        }





    }
}
