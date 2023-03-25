package IfStatement;

public class Practice1 {
    public static void main(String[] args) {

        int money = 100;
        int item$ =50;
        System.out.println("First Print before if statement");

        if( money > item$){
            System.out.println( "you are buying the item");
}
        System.out.println( "Another print AFTER if Statement");

        int item2$ =99;

        if (money>item2$) {
            System.out.println("I am buying ITEM2");
        }

        //you have another option as using your credit card if the money is not enough

        boolean creditCard=true;

        if (money>item$ || creditCard ==true) {//if money=1 $-->false, cc is True-->> we got False||( ||mean or)or
            // True it is TRUE----->> we can do it and sout
            System.out.println("You are using 2 different option to buy ITEM");
        }









    }
}
