package leetcode;

public class 买卖股票的最佳时机 {
    public static void main(String[] args) {
         int[] nums= {7,1,5,3,6,4};
        //int[] nums= {1,2};
       System.out.println(helper(nums));
    }
    //使用动态规划，dp数组，动态记录每一天可以得到的最大利润
    //i：代表天数，用0-nus.length-1的索引下标表示
    //k：代表交易的次数限制
    //0，1代表是否持有股票。
    //如果今天选择不持有股票，可以选择卖出之前的股票（如果昨天持有股票），也可以选择不操作（如果昨天不持有股票）；
    //如果今天选择持有股票，那么可以选择不进行操作（如果昨天持有股票）买入股票（如果昨天不持有股票）。
    public  static  int helper(int[] nums){
        int n=nums.length;
        int [][] dp =new int [n][2];
        for(int i=0;i<n;i++){
            if (i - 1 == -1) {
                dp[i][0] = 0;
                dp[i][1] = -nums[i];
                continue;
            }
            dp[i][0]=Math.max(dp[i-1][0],dp[i-1][1]+nums[i]);
            dp[i][1]=Math.max(dp[i-1][1],dp[i-1][0]-nums[i]);
        }
        return dp[n-1][0];
    }
}
