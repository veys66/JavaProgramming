package day09_IfStatement2;

public class LeapYear {
    public static void main(String[] args) {
        int year = 2000;
        boolean leapYear = year% 4== 0;

        if(leapYear) {
            System.out.println("Year "+ year+" is a leap year");
        }
        if(!leapYear) {
            System.out.println("Year " + year + " is a NOT leap year");
        }
        System.out.println("-----------------------------------------------------------");
        if(leapYear) {
            System.out.println("Year "+ year+" is a leap year");
        } else {
            System.out.println("Year " + year + " is a NOT leap year");
        }
        //if & else statement we can NEVER apply for the tasks that requires more than ywo condition!!!


    }
}
