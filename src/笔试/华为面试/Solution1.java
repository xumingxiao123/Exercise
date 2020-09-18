package 笔试.华为面试;

import java.util.Arrays;

public class Solution1 {
    public static void main(String[] args) {
      int[] nums={0,1,0,3,12};
      moveZeroes(nums);
      System.out.print(Arrays.toString(nums));
    }
    public  static  void moveZeroes(int[] nums){
        for (int j=0;j<nums.length;j++){
            for (int i=0;i<nums.length-1-j;i++){
                if (nums[i]==0&&nums[i+1]!=0){
                    int temp=nums[i];
                    nums[i]=nums[i+1];
                    nums[i+1]=temp;
                }
            }
        }
    }
}
