package day10_NestedIf;

public class DaysInWeek {
    public static void main(String[] args) {

        int number = 5;

        if (number >= 1 && number <= 7) {//if the number is valid number (1~7)

            if (number == 1) {
                System.out.println("Monday");
            } else if (number == 2) {
                System.out.println("Tuesday");
            } else if (number == 3) {
                System.out.println("Wednesday");
            } else if (number == 4) {
                System.out.println("Thursday");
            } else if (number == 5) {
                System.out.println("Friday");
            } else if (number == 6) {
                System.out.println("Saturday");
            } else {
                System.out.println("Sunday");
            }


        } else{ //if the number is not valid
            System.out.println("Invalid Number");
        }
        System.out.println("-----------------------------------------------------------------------------------");









    }
}
