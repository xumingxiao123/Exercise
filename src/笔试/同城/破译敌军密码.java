package 笔试.同城;

import java.util.*;
public class 破译敌军密码 {
    public int translateNum (int num) {
        // write code here
        String s=String.valueOf(num);
        int[] dp= new int[s.length()+1];
        dp[0]=1;
        dp[1]=1;
        for(int i=2;i<dp.length;i++){
            dp[i]=dp[i-1];
            int temp=Integer.parseInt(s.substring(i-2,i));
            if(temp>=10&&temp<=25){
                dp[i]+=dp[i-2];
            }
        }
        return dp[s.length()];

    }
}
