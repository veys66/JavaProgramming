package day24_CustomMethod_Return;

public class ReturnMethodPractice4 {
    private static CharSequence str;

    public static void main(String[] args) {
        String str = "cccccccccdddddaaaaaabbbbbb";
        str= removeDuplicates(str);

        System.out.println(str);

    }
    //1. create a method that can remove duplciated characters from a string and returns the new value
    public static String removeDuplicates(String str){// "aaabbcc"

        String result = "";

        for (int i = 0; i < str.length() ; i++) {
            char each = str.charAt(i);

            if(!result.contains(""+each)){
                result +=each;
            }
            
        }

        return result;
    }









}
