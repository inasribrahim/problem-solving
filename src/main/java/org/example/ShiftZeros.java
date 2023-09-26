package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class ShiftZeros {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        moveZeroes(nums);
    }

    public static void moveZeroes(int[] nums) {
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                if (nums[i] > nums[j] && nums[i]            != 0  ) {
//                    int temp = nums[i];
//                    nums[i] = nums[j];
//                    nums[j] = temp;
//                }
//            }
//        }
        List<Integer> ls = new ArrayList<>() ;

        int i = 0;
        for (int num:nums){
            if(num != 0){
                ls.add(num);
                i++;
            }
        }
        while(ls.size() != nums.length){
            ls.add(0);
        }
       for(int j = 0 ; j < ls.size(); j++){
           nums[j] = ls.get(j);
       }

        System.out.println(Arrays.toString(nums));
    }
}