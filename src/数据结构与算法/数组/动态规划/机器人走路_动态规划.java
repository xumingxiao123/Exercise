package 数据结构与算法.数组.动态规划;

public class 机器人走路_动态规划 {
    public static void main(String[] args) {
        /**
         * @param N ：共N个位置
         * @param M ：开始位置
         * @param P ：可以走的步数
         * @param K ： 目标位置
         * @return
         **/
        int N=15;
        int M=5;
        int P=7;
        int K=10;
        System.out.println(walkDP(N,M,P,K));
    }
    public static int walkDP(int N,int M,int P,int K){
        //有P,M两个变量
        int dp[][]=new  int[N+1][P+1];
        dp[K][0]=1;
        //最大步数
        for(int j=1;j<=P;j++)
            //最大范围
            for(int i=1;i<=N;i++){
                // 在第一个位置上
                if(i==1){
                dp[i][j]=dp[i+1][j-1];
                // 在最后一个位置上
                }else if(i==N){
                dp[i][j]=dp[i-1][j-1];
                // 想左向右两种选择
                }else{
                    dp[i][j]=dp[i+1][j-1]+dp[i-1][j-1];
                }
            }
        return dp[M][P];
    }
}
