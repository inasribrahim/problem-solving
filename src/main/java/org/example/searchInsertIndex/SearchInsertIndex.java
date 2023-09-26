package org.example.searchInsertIndex;

public class SearchInsertIndex {

    public static void main(String[] args){
        int []nums = {1,3,5,6};
        int target = 7;
        System.out.println(searchInsert(nums,target));
        //2 passed
        //1 passed
    }

    public static int searchInsert(int[] nums, int target) {
        int index = 0 ;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] == target) return index = i;
            else if (nums[i] < target && i < nums.length -1 && nums[i+1] > target){
                index = i + 1 ;
            }
            else if (target > nums.length)
            {
             index = nums.length + 1;
            }

        }
        return index;
    }
}
