package day09_IfStatement2;

public class MedianNumber {
    public static void main(String[] args) {
        int a=10;
        int b= 15;
        int c=20;

        boolean aIsMedian = (a > b && a < c) || (a > c && a < b);
        /*
        in orde for a to be median number
        1. if c is the max number & b is the min number, then a is median num
        2. if b is the max number & c is the min number, the a is median num
         */
        boolean bIsMedian = (b > c && b > a) || (b > a && b < c);
        boolean cIsMedian = !aIsMedian && !bIsMedian;

        if (aIsMedian) { // if a is the median number
            System.out.println(a+" is the median number");
        }


        if (bIsMedian) { // if b is the median number
            System.out.println(b+" is the median number");
        }

        if (cIsMedian) { //if c is the median number
            System.out.println(c+" is the median number");
        }


    }
}

/*
2. Create a class called MedianNumber. write a program that can find the median number between three DIFFERENT given integers
        Ex:
    a = 10, b= 15, c = 20;

        Output:
            15 is the median number

        Posibility #1: a could be median number
        Posibility #2: b could be median number
        Posibility #3: c could be median number
 */