package day49_Collections;

import java.util.*;

public class SetPractice2 {
    public static void main(String[] args) {
        String [] arr= {"Wooden Spoon", "Book", "Pen", "Phone", "Wooden Spoon", "Wooden Spoon", "Wooden Spoon", "Wooden Spoon", "Milk", "Egg",
        "Coke", "Paper Towels"};

        new HashSet<>(Arrays.asList(arr)).toArray(new String[0]);
/*
        Set<String> set1= new HashSet<>(Arrays.asList(arr));
        arr=set1.toArray(new String[0]);

        System.out.println(set1);
*/
        System.out.println(Arrays.toString(arr));

        ArrayList<Integer> list=new ArrayList<>();
        list.addAll(Arrays.asList(1000, 300, 1000, 200, 300, 400, 500, 600, 10, 10, 20, 30, 40, 30, 20, 10));

        list=new ArrayList<>(new LinkedHashSet<>(list));

        System.out.println(list);

        System.out.println("-----------------------------------------------------------------------------------------");

        String [] array={"A", "A", "B", "C"};

        List<String> s=new ArrayList<>();

        s.addAll(Arrays.asList("E", "F", "G"));

        System.out.println("-----------------------------------------------------------------------------------------");

        String str="aaaaabbbbbccccdddeeeee";

        String result=""; //a4b4c4d3e5



    }
}
