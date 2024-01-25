package org.example;


import java.util.ArrayList;
import java.util.List;

public class MissingNumber {


    public static void main(String[] args) {
        fineMissingNumber();
    }

    // nums array should have numbers from 1 to 10
    // write a program to find the missing numbers in the array and pring them
     private static void fineMissingNumber() {
         int[] nums = {1, 2, 4, 5, 6, 8, 9, 10};
         List<Integer> integerList = new ArrayList<>();
         for (Integer i :nums){
             integerList.add(i);
         }
         for (int i=1;i<=10;i++){

             if (!integerList.contains((Integer) i)){
                 System.out.println("The missing number in array is : "+i);
             }
         }
     }
}