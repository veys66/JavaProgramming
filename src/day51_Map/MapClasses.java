package day51_Map;

import java.util.*;

public class MapClasses {

    public static void main(String[] args) {
        //     key    value
        Map<Integer, String> hashMap= new HashMap<>();

        hashMap.put(10, "Arthur");
        hashMap.put(20, "George");
        hashMap.put(3, "Jack");
        hashMap.put(40, "Emma");
        hashMap.put(5, "Isabella");

        System.out.println("hashMap = " + hashMap);

        Map<Integer, String> linkedHashMap = new LinkedHashMap();

        Map<Integer, String> treeMap= new TreeMap<>();

        Map<Integer, String> hashtable = new Hashtable<>();


    }
 }
