package org.example;

public class List {
    public static void main(String[] args){
        int [] nums = {3,2,2,3};
        removeElement(nums,3);
    }
    public static int removeElement(int[] nums, int val) {
        int i = 0 ;
        for(int num:nums){
            if(num != val){
                int temp = num;
                num = nums[i];
                nums[i] = temp;
                i++;
            }
        }
        return i;
    }
}
