package day16_ForLoopStringPractice;

public class DigitLetters {
    public static void main(String[] args) {

        String str="Cydeo12345school!@#$%WoodenSpoon";

        String digits=""; //12345
        String letters=""; //CydeoWoodenSpoon
        String specialChars=""; //!@#$%


        for (int i = 0; i < str.length(); i++) {

            char ch= str.charAt(i); //ch: each character that we have in str

            if(ch>='0' && ch <= '9') {
                digits += ch;
            }else if(ch >= 'A' && ch <= 'Z'){ //if the characters is between 'A' to 'Z' then its letter
                letters += ch;
            }else if (ch >= 'a' && ch <= 'z'){ //if the characters is between 'a' to 'z' then its letter
                letters +=ch;
            }else{ //if the characters is neither digit nor letter, then it`s special character
                specialChars +=ch;
            }


        }
        System.out.println("digits = " + digits);
        System.out.println("letters = " + letters);
        System.out.println("specialChars = " + specialChars);

    }
}
