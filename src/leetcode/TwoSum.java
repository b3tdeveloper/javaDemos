package leetcode;

public class TwoSum {
    public static void main(String[] args){
        int[] nums = {
                1,2,5
        };
        int target = 6;
        int[] sum = twoSum(nums,target);

        System.out.println(sum[0] + " " + sum[1]);


    }

    public static int[] twoSum(int[] nums, int target) {
        int[] index = new int[2];
        boolean close = false;
        for(int i = 0; i < nums.length; i++){
            for (int j = i+1; j < nums.length; j++){
                if (nums[i] + nums[j] == target){
                    index[0] = i;
                    index[1] = j;
                    close = true;
                    break;
                }
            }
            if (close) break;

        }
        return index;
    }
}
