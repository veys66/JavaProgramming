package day12_Scanner;

import java.util.Scanner;

public class ShippingAddress {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //Enter

        System.out.println("Enter your full name: ");
        String fullName= scan.nextLine(); //Java ProgrammingEnter

        System.out.println("Enter your building number: ");
        String building =scan.next(); //7925A

        scan.nextLine();//Enter

        System.out.println("Enter your street name: ");
        String street = scan.nextLine();

        System.out.println("Enter your city name: ");
        String city= scan.nextLine();//McLeanEnter

        System.out.println("Enter your state name: ");
        String state= scan.next();//VAEnter

        System.out.println("Enter your zip code: ");
        String zipCode= scan.next(); //22012Enter

        scan.nextLine();//EnterEnter

        System.out.println("Enter your country name: ");
        String country = scan.nextLine();

        scan.close();



    }
}


/*
1. Enter your full name  nextLine
2. Enter your building number next()
3. Enter your street name  nextLine
4.Enter your city name     nextLine
5. Enter your state        next
6. Enter your zip code     next

Display the shipping adress
John Smith
7925 Jones Branch Dr
VA
 */