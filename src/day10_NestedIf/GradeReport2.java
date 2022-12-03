package day10_NestedIf;

public class GradeReport2 {
    public static void main(String[] args) {
        int score = 45;

        if (score>=0 && score <= 100){// if the score is valid
            //5 posibilities: A, B, C, D, F
            if (score >=90){// fails: score <90
                System.out.println("excellent");;
            }else if (score >=80){// false> score < 80
                System.out.println("great");
            }else if(score >=70){ // false: score <70
                System.out.println("good");
            }else if(score >=60){ //false: score <60
                System.out.println("passed");
            } else {
                System.out.println("failed");
            }

        }else{// if the score is NOT valid
            System.out.println("Invalid Score");
        }
        System.out.println("------------------------------------------------------------------------");
        //solution2 : use ternaries ONLY
        String result=(score >=0 && score <=100)? (score>=90)? "Excellent" :(score>=80)? "Great": (score>=70)? "Good":(score>=60)? "Passed" : "Failed"
                :"Invalid Score";
        System.out.println(result);

        System.out.println("-------------------------------------------------------------------");
        //solutions3:

        String result2="";
        if (score>=0 && score <= 100) {
            result2 = (score >= 90) ? "Excellent" : (score >= 80) ? "Great" : (score >= 70) ? "Good" : (score >= 60) ? "Passed" : "Failed";
        }else { //if the s is NOT valid
            result2= "Invalid Score";

        }
        System.out.println(result2);




    }
}
