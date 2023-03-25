package IfStatement;

public interface NestedIfPractice {
    public static void main(String[] args) {
        /* TRAVEL
       check iD
          check visa
             check ticket
         */
        boolean id =true, visa =true, ticket =true;//can change true or false and see how change result after run code

        if(id) {
            if (visa) {
                if (ticket){
                    System.out.println(" Enjoj your flight!!");
                }

            }else {
                System.out.println("You should have a visa");
            }
        }else {
            System.out.println(" First, you should have valid ID");


        }












    }
}
