package day03_EscapeSequences; // Package name od the class

import java.sql.SQLOutput;

public class Print_VS_Print2 {

    public static void main(String[] args) { // main method
        System.out.println("Knock Knock"); // first it prints knock knock, then it appends a new line
        System.out.println("Who is this?");

        System.out.println("This is Java");

        System.out.println("---------------------------------");

        System.out.print("Knock Knock"); // prints Knock Knock, doesnt append new line
        System.out.print("Who is this?");
        System.out.print("This is Java");


        System.out.println();
        System.out.println("---------------------------------");

        System.out.println("Hello everyone, how are you all today? Today we will learn Escape Sequences and next week we will learn Variables");

        System.out.println("-----------------------------------------");

        System.out.print("Hello Everyone, How are you all today? ");
        System.out.print("Today we will learn Escape Sequences ");
        System.out.print("and next week we will learn Variables");

    }
}
//Single line comment goes here


/*
Topics:
println method
print
 */
