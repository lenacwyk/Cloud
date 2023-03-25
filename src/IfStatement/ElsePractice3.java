package IfStatement;

public class ElsePractice3 {
    public static void main(String[] args) {

         /*
        pick a number between 0 and 100

        if the number is 90 - 100-->> your grade is A
        if the number is 80 - 89-->> your grade is B
        if the number is 70 - 79-->> your grade is C
        if the number is 60 - 69-->> your grade is D
        if the number less then 60 -->> "Pleaae come again "


       */

        int test1 = 25, test2 = 60, test3 = 100, average = 0;
        average = (test1 + test2 + test3 ) / 3;

        if (average >=90 && average<=100) {
            System.out.println("A");
        }else  if(average>=80 && average<=89) {
            System.out.println("B");
        }else  if(average>=70 && average<=79) {
            System.out.println("C");
        }else if(average>=60 && average<=69) {
            System.out.println("D");

        }else {
            System.out.println("Please come again");

            }





        }


    }

