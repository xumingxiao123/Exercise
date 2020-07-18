package 数据结构与算法.字符串;

public class 最长公共子序列 {
    public static void main(String[] args) {
        String str1="fffffabcdefgfffffff";
        String str2="zzzzzabcdefgzzzzzzz";
        System.out.println(longestCommonSubsequence(str1,str2));

    }
    public static  int longestCommonSubsequence(String str1,String str2){
        char[] chars1=str1.toCharArray();
        char[] chars2=str2.toCharArray();
        int dp[][]=new int [chars1.length+1][chars2.length+1];
        for(int i=1;i<=chars1.length;i++){
            for(int j=1;j<=chars2.length;j++){
                if(chars1[i-1]==chars2[j-1]){
                    dp[i][j]=dp[i-1][j-1]+1;
                }else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[chars1.length][chars2.length];
    }
}
