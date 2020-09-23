package 笔试.去哪儿网;

import java.util.Scanner;

public class 一期需求 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n=cin.nextInt();
        StringBuilder s1=new StringBuilder();
        StringBuilder s2=new StringBuilder();
        for (int i=0;i<n;i++){
            s1.append(cin.next());
        }
        for (int i=0;i<n;i++){
            s2.append(cin.next());
        }
        String S1=s1.toString();
        String S2=s2.toString();
        int[][] dp = new int[s1.length() + 1][s2.length() + 1];
        for(int i = 1 ; i < s1.length() + 1 ; i ++){
            for(int j = 1 ; j < s2.length() + 1 ; j ++){
                //如果末端相同
                if(S1.charAt(i-1) == S2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1] + 1;
                }else{
                    //如果末端不同
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        System.out.print(dp[s1.length()][s2.length()]);
    }
}
