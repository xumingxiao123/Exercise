package leetcode;

public class 零钱兑换 {
    public static void main(String[] args) {
        int[] coins={1,2,5};
        int amount=11;
        //dp数组记录当前数字最小硬币数
        int [] dp= new int[amount+1];
        //数组中存储最差的情况
        for(int i=0;i<dp.length;i++){
            dp[i]=amount+1;
        }
        //基本情况即为0时，需要0个硬币
        dp[0]=0;
        for(int i=0;i<dp.length;i++){
//            for(Integer coin:coins){
//                if(i<coin) continue;
//                dp[i]=Math.min(dp[i],1+dp[i-coin]);
//            }
            //
            for(int j=0;j<coins.length;j++){
                if(i<coins[j]) continue;
                //将当前金额减去当前硬币值,求出之前已经保存的金额最小值
                // 动态将最小值存储
                dp[i]=Math.min(dp[i],dp[i-coins[j]]+1);
            }
        }
        System.out.print((dp[amount] == amount + 1) ? -1 : dp[amount]) ;
    }
}
