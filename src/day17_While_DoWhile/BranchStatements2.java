package day17_While_DoWhile;

public class BranchStatements2 {

    public static void main(String[] args) {

        for (int i = 'A'; i <= 'E'; i++) {

            if(i=='C'){
                continue;
            }

            System.out.println(i);
        }

        System.out.println("-------------------------------------");
        //print all even numbers 1~10 (skip the odd numbers)
        for (int i = 1; i < 11; i++) {//1~10
            if(i%2 !=0){ //1,3,5,7,9
                continue; //Skip
            }
            System.out.println(i);
        }

        System.out.println("------------------------------------------");
        //print all odd numbers between 1~10 (skip the evn numbers)

        for (int i = 1; i < 11; i++) {//1~10
            if(i%2==0){ //1,3,5,7,9
                continue; //Skip
            }
            System.out.println(i);
        }






















    }
}
