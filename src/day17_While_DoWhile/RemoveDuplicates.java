package day17_While_DoWhile;

public class RemoveDuplicates {
    public static void main(String[] args) {

        String str= "AABBCC";

        String result = "";

        for (int i = 0; i <str.length() ; i++) {
            String ch =""+str.charAt(i);

            if(result.contains(ch)){ // "A", "A", "B",
                continue; //skips
            }
            result += ch;
        }

        System.out.println(result);









    }
}
