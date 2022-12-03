package day26_CustomMethodsPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class RemoveElements2 {
    public static void main(String[] args) {
        int [] numbers= {100,200,300,400,500,600};

        numbers = removeElement(numbers, 1); //{100, 300, 400, 500, 600}
        numbers = removeElement(numbers, 1);

        System.out.println(Arrays.toString(numbers));
    }

    public static int [] removeElement (int [] array, int index){
        int [] result = {};

        for (int i = 0; i < array.length; i++) {
            if(i != index){
                result=ArraysUtility.addElement(result, array[i]);
            }

        }
        return result;
    }





}
