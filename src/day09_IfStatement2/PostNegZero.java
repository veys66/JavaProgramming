package day09_IfStatement2;

public class PostNegZero {
    public static void main(String[] args) {
        int n =100;

    if( n >0) {
        System.out.println("Positive");
    }

    if(n <0) {
        System.out.println("Negative");
    }
    if(n==0) {
        System.out.println("Zero");
    }

        System.out.println("--------------------------------------------------------------");
    boolean positive=n>0;
    boolean negative=n<0;


    if(positive) {
        System.out.println("Positive");
    }else if(negative){
            System.out.println("Negative");
    }else{
        System.out.println("Zero");
    }
        System.out.println("-------------------------------------------------------------------");
    if (positive) {
        System.out.println("Positive");
    }

    if(negative) {
        System.out.println("Negative");
    }else {
        System.out.println("Zero");
    }
    }




    }



