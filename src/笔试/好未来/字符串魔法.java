package 笔试.好未来;

import sun.security.util.Length;

import java.util.Scanner;

public class 字符串魔法 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n=cin.nextInt();
        String s=cin.next();
        int[][] dp= new int [n][n];
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                 dp[i][j]=-1;
            }
        }
        System.out.println(helper(0,n-1,dp,s));
    }
    static int helper(int m,int n,int dp[][],String s){
      if (m>n) return 0;
      if (m==n) return 1;
      if(dp[m][n]!=-1) return dp[m][n];
      int res=1+helper(m+1,n,dp,s);
      for(int i=m+1;i<=n;i++){
          if (s.charAt(i)==s.charAt(m)) res=Math.min(res,helper(m+1,i-1,dp,s)+helper(i,n,dp,s));
      }
      return dp[m][n]=res;
    }
}
