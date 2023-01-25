package day50_Collections_Map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IterablePractice {
    public static void main(String[] args) {

        List<Integer> list= new ArrayList<>(Arrays.asList(1,2,3,4,5,1,2,3,4,5,12,3,4,5));

        //remove all the elements that are less than 4

        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) < 4){
                list.remove(i);
            }
        }

        System.out.println(list);

    }
}
