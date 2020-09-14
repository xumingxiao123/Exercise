package 笔试.巨人网络;

public class 字符串中最大公共子串 {
    public static void main(String[] args) {
        System.out.print(GetCommon("abccade","dgc"));

    }
    public static String GetCommon (String str1, String str2) {
        // write code here
        int[][] dp=new int[str1.length()+1][str2.length()+1];
        //int start=0;
        int end=0;
        int maxlen=0;
        for (int i=1;i<str1.length()+1;i++){
            for (int j=1;j<str2.length()+1;j++){
                 if (str1.charAt(i-1)==str2.charAt(j-1)){
                     dp[i][j]=dp[i-1][j-1]+1;

                 }else{
                     dp[i][j]=Math.max(dp[i][j-1],dp[i-1][j]);
                 }
//                 if (dp[i][j]>end-start+1){
//                    end=i-1;
//                    start=end-dp[i][j]+1;
//                 }
                if (dp[i][j]>maxlen){
                    maxlen=dp[i][j];
                    end=i-1;
                }
            }
        }
        return str1.substring(end-maxlen,end);
    }
}
