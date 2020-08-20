package leetcode;

public class 打家劫舍 {
    public static void main(String[] args) {
        int[] nums ={1,2,3,1};
        //使用dp数组动态记录最优解
        int[] dp=new int[nums.length];
        //基本情况
        dp[0]=nums[0];
        dp[1]=Math.max(nums[0],nums[1]);
        for(int i=2;i<dp.length;i++){
            dp[i]=Math.max(dp[i-1],dp[i-2]+nums[i]);
        }
        System.out.print(dp[nums.length-1]);
    }
}
