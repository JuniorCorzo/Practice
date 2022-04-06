package LeetCode;


import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {0,4,3,0};
        int target = 0;

        final int[]  result = new int[2];
        int sum = 0;
        for (int j = 0; j < nums.length; j++) {
            if(j != 0){
                if(sum == target){
                    break;
                }
            }

            for (int i = j+1; i < nums.length; i++) {
                if(nums[j] > 0) sum = (nums[j]) + (nums[i]);
                if(nums[j] < 0){
                    sum = (nums[j]) + (nums[i]);
                    if(sum < 0) sum = sum * -1;
                }
                if(nums[j] == 0) sum = (nums[j]) + (nums[i]);


                if(j != i){
                    if (sum == target) {
                        result[0] = j;
                        result[1] = i;
                        System.out.println(Arrays.toString(result));
                        break;
                    }
                }
            }
        }

    }
}
