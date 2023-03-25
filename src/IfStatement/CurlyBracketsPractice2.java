package IfStatement;

public class CurlyBracketsPractice2 {
    public static void main(String[] args) {

        int k = 3, m = k+5, t = 1;

        if ( m>=k )
           t = k++   +    k  + m; //3+4+8=15

        ++t;


        System.out.println( --t ); // 15
        System.out.println(t); // 15

        System.out.println("==================");

        if ( t < ++k)
            ++k;
           ++t;
        System.out.println(++t);  // 17


















    }
}
