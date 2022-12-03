package day17_While_DoWhile;

public class FrequencyOfWord2 {
    public static void main(String[] args) {
        String str = "Cat Cat Dog Dog cAt CAT caT";

        int frequency= 0;

        for (int i = 0; i <= str.length()-3; i++) { //i: 1,2,3,4,5,6,7
            String eachSub= str.substring(i, i+3 );


            //if(eachSub.equals("Cat")){//2
            if(eachSub.equalsIgnoreCase("Cat")){

                frequency++;
            }

        }
        System.out.println(frequency);
    }
}
