package day50_Collections_Map;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ListSetPractice {

    public static void main(String[] args) {

        Set<Integer> set= new HashSet<>();
        set.addAll(Arrays.asList(1,2,3,4,5,1,2,3,4,5));

        System.out.println(set);



    }


}
