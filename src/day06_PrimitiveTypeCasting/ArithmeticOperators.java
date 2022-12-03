package day06_PrimitiveTypeCasting;

public class ArithmeticOperators {
    public static void main(String[] args) {
        System.out.println("12" + 1); //121, concatenation
        System.out.println(10 + 20);  //30
        System.out.println(100 - 50); //50
        System.out.println(10 * 6);  //600

        System.out.println(100 / 3);
        System.out.println(10/4 );
        System.out.println(10.0/4 );
        System.out.println(10/ 4.0);
        System.out.println( 10d/4);


        int a = 100;
        double b = a/6 ; //16
        System.out.println(b);

        double c = a/6d; //16.66666
        //double b = 16:

        System.out.println(c);

        System.out.println( 100D );




    }
}
/*
+: Addition
-: Subtract
*: Multiplication
/: Division
        integer/ integer =====> integer
        decimal/ integer =====> decimal
        integer/ decimal =====> decimal
        decimal/ dec'mal =====> decimal

        in math
            10/4= 2.5
         in java:
            10/4 = 2
            10.0/4= 2.5

%: Remainder
 */