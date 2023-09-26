package org.example;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");

//    int [] nums = {0,0,1,1,1,2,2,3,3,4};
//    int [] nums = {0,0,1,1,1,2,2,3,3,4};
    int [] nums = {1,1,2};
        System.out.println(removeDuplicates(nums));
    }

//    public static int removeDuplicates(int[] nums) {
//        Set<Integer> removeDuplicateSet = new HashSet<>();
//        for(int i : nums){
//            removeDuplicateSet.add(i);
//        }
//        System.out.println(Arrays.toString(removeDuplicateSet.toArray()));
//        return removeDuplicateSet.size();
//    }
    public static int removeDuplicates(int[] nums) {
        int j = 1;
        for (int i = 0; i < nums.length; i++) {
            // i = 1 -> 0 != i = 0 ->
            if (nums[i] != nums[i + 1]) {
                System.out.println(nums[i]);
                System.out.println(nums[i-1]);
                nums[j] = nums[i];
                j++;
            }

        }
        System.out.println(Arrays.toString(nums));
        return j;
    }
}