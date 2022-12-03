package day03_EscapeSequences;

/*
escape sequences: MUST be given with double quote
    \n: stars a new line
    \t: tab (paragraph)
    \\: single back flash
    \": double quote

 */
public class EscapeSequences {
    public static void main(String[] args) {
        System.out.println("Java \nPython \nC#");

        System.out.println("------------------------------------------------------");

        System.out.println("Hello Cydeo \nHow are you all today? \nIt`s nice to see you all! \nWhat class do we have next week?");

        System.out.println("------------------------------------------");

        System.out.println("\tJava is cool programming language");

        System.out.println("----------------------------------------------");

        System.out.println("/ \\"); // in order to print one backward slash we need to give two backward slashes

        System.out.println("----------------------------------------------");

        System.out.println("My favorite Tv show is \"Game Of Throne\""); // in order to print double quote we need use \"

    }


}
