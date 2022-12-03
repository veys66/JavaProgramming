package day11_Switch_Scanner;

public class GradeReport {
    public static void main(String[] args) {
char ch= 'B';
///String result= "";

    switch (ch){
        case 'A':
            System.out.println("Excellent"); //result= "Excellent"
            break;
        case 'B':
            System.out.println("Great");
            break;
        case 'C':
            System.out.println("Good");
            break;
        case 'D':
            System.out.println("Passed");
            break;
        case 'F':
            System.out.println("Failed");
            break;

        default:
            System.out.println("Invalid");
    }




    }
}
/*
3. a char variable named grade is given. use switch statement to print the following messages:

'A': excellent
'B': great job
'C': good
'D': passed
'F': failed
other wise: invalid
 */