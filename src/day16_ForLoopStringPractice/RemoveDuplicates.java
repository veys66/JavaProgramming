package day16_ForLoopStringPractice;

public class RemoveDuplicates {
    public static void main(String[] args) {

        String str = "aabbcc";

        String result = ""; //a
                      //i<= 7 ===> i < 8
        for (int i = 0; i < str.length()-1; i++) {//i: represents the all the iondex numbers of str (start from 0)

            String ch = "" + str.charAt(i); //represents each Character of str

            if (!result.contains(ch)) { //if the character is not contained in the result
                result += ch; // the character will be added to the result
            }
        }

        System.out.println(result);
    }
}
