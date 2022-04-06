package LeetCode;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int target = -5;
        int[] nums = {5};
        Arrays.sort(nums);
        int result = 0;

        int index = (nums.length / 2);
        int i = 0;
        while(nums[result] != target){
            if(nums.length == 1){
                if(nums[index] == target){
                    result = index;
                    break;
                }

                result = -1;
                break;
            }

            if(nums[index] < target) index ++;
            if(nums[index] > target) index --;
            if(nums[index] == target) result = index;

            if(i == nums.length){
                result = -1;
                break;
            }
            i++;
        }
        System.out.println(result);
    }
}
