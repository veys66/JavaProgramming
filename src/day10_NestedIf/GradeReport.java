package day10_NestedIf;

public class GradeReport {
    public static void main(String[] args) {
    /*
    90~100: excellent
    80~89: great
    70~79: good
    60~69: passed
    0~59: failed
    */
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

    String result=""; //temporary
        if (score>=0 && score <= 100){// if the score is valid
            //5 posibilities: A, B, C, D, F
            if (score >=90){// fails: score <90
                result= "excellent";
            }else if (score >=80){// false> score < 80
                result="great";
            }else if(score >=70){ // false: score <70
                result="good";
            }else if(score >=60){ //false: score <60
                result="passed";
            } else {
                result="failed";
            }

        }else{// if the score is NOT valid
            result="Invalid Score";
        }





    }
}
