package 笔试;

import java.util.Arrays;

class DELETE {
    public static void main(String[] args) {
        int[] nums={1,2,3,3,4,4};
        System.out.print(Arrays.toString(helper(nums)));
    }

    private  static  int[]  helper(int[] nums){
        int i=0;
        int j=1;
        while (j<nums.length){
            if (nums[i]!=nums[j]){
                i++;
                j++;
            }else{
                while (j<nums.length&&nums[i]==nums[j]){
                    j++;
                }
                if (i+1<nums.length&&j<nums.length){
                    nums[i+1]=nums[j];
                }
                i++;
                j++;
            }
        }
        return nums;
    }
}
