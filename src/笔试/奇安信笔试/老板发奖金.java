package 笔试.奇安信笔试;

import sun.applet.Main;

public class 老板发奖金 {
    public static void main(String[] args) {
        System.out.print(CalulateMethodCount(4));
    }
    public static int CalulateMethodCount (int num_money) {
        // write code here
        //  int[] s=new int[num_money+1];
        int n=num_money;
        if(n==1) return 1;
        if(n==2) return 2;
        if(n==3) return 4;
        long[] dp= new long[n+1];
        dp[1]=1;
        dp[2]=2;
        dp[3]=4;
        for(int i=4;i<=n;i++){
            dp[i]=(dp[i-1]+dp[i-2]+dp[i-3])%1000000007;
        }
        return (int)dp[num_money];
    }

}

