package day50_Collections_Map;

import java.util.*;

public class ListSetPractice {

    public static void main(String[] args) {

        Set<Integer> set= new HashSet<>();
        set.addAll(Arrays.asList(1,2,3,4,5,1,2,3,4,5));

        System.out.println(set);

        //Integer[] array =set.toArray(new Integer[0]);

        List<Integer> list = new ArrayList<>( set );

        System.out.println(list);

        List<String> name= null;

        //System.out.println(names.size());

        System.out.println("---------------------------------------------------------------------------------------");

        //pop()

        List<Character> chars = new Stack<>();
        chars.addAll(Arrays.asList('A', 'B', 'C', 'D'));


        ((Stack)chars).pop();

        System.out.println("chars = " + chars);//[A, B, C]

        //poll() ==> FIFO

        List<String > names=new LinkedList<>();
        names.addAll(Arrays.asList("James", "Jimmy", "Kathy", "Breanna", "Max"));

        System.out.println(names);

        ((LinkedList<String>) names).poll();

        System.out.println(names);

        ((LinkedList<String>) names).poll();

        System.out.println(names);






    }


}
