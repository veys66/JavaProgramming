package day23_CustomMethods_Void;

public class CustomMethodsWithParameters {
    public static void main(String[] args) {
        oddOrEven(6); //methods demands additional info to complete its task

        ageOfPerson(1985);

        printNumbers(1000, 2000);




    }

    //create a function that can check if a number is odd number of even number
    public static void oddOrEven(int number){
        if(number % 2 ==0){
            System.out.println(number +" is even number");
        }else {
            System.out.println(number +" is odd number");
        }

    }

    //create a function that can display the age of the person
    public static void ageOfPerson (int birthYear){

        int age = 2021-birthYear;

        System.out.println("Your age is: "+age);

    }

    public static void printNumbers(int x, int y){

    }









}
