package 算法专题;

public class 最大字序和 {
    public static void main(String[] args) {
        int[] nums={-2,1,-3,4,-1,2,1,-5,4};
        System.out.print(maxSubArray(nums));
    }
    private static int maxSubArray(int[] nums) {
        int len = nums.length;
        if (len == 0) {
            return 0;
        }
        //dp数组
        int[] dp = new int[len];
        //状态初值
        dp[0] = nums[0];
        //如果第 i-1 个子组合的最大值没法给第 i 个数字带来正增益，我们就抛弃掉前面的子组合，自己就是最大的了。
        for (int i = 1; i < len; i++) {
            if (dp[i - 1] >= 0) {
                dp[i] = dp[i - 1] + nums[i];
            } else {
                dp[i] = nums[i];
            }
        }
        // 最后不要忘记全部看一遍求最大值
        int res = dp[0];
        for (int i = 1; i < len; i++) {
            res = Math.max(res, dp[i]);
        }
        return res;
    }

}
