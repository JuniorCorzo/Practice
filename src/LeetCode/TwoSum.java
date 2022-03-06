package LeetCode;


import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 5, 5};
         final int[]  result = new int[2];
        int sum = 0;
        for (int j = 0; j < nums.length; j++) {
            if(sum == 10){
                break;
            }
            for (int i = 1; i < nums.length; i++) {
                sum = (nums[j]) + (nums[i]);

                if (sum == 10) {
                    if(j == i)break;
                    result[0] = j;
                    result[1] = i;
                    System.out.println(Arrays.toString(result));
                    break;
                }
            }
        }

    }
}
