package day10_NestedIf;

public class FieldTrip {
    public static void main(String[] args) {
        int grade= 2;
String location ="";
int groupNumber = 0;
String teacher= "";

if (grade >=1 && grade <=6){
    if (grade==1){
        location= "Apple orchard";
        groupNumber=3;
        teacher="Ms. Smith";
    }else if (grade ==2){
        location= "Zoo";
        groupNumber=7;
        teacher="Mr. Lee";
    }else if (grade ==3) {
        location = "Aquarium";
        groupNumber = 5;
        teacher = "Ms. Wilson";
    }else {
        System.out.println("Invalid Grade");
    }
    System.out.println("location = " + location+"\nnumber of groups -");
    System.out.println("groupNumber = " + groupNumber);
    System.out.println("teacher = " + teacher);
}

    }
}


/*
Your school goes on a trip each year.
The place you go will be based on your grade. Given a variable gradeNumber (1-6) figure out detail of your field.
 */