package 数据结构与算法.数组.动态规划;

public class 剪绳子_迭代方法的动态规划2 {
    public static void main(String[] args) {
        int target =8;
        System.out.println(maxlen(target));
    }
    public static  int maxlen(int target){
        //定义一个dp数组，长度为len+1。下标为0位置不使用
        int len=target;
        int[] dp=new int[len+1];
        //这里初始化到3，是因为在3之前取自身便是最大
        dp[0]=-1;
        dp[1]=1;
        dp[2]=2;
        dp[3]=3;
        //由于n>1并且m>1，所以要做特殊判别
        if(len==2){
            return 1;
        }else if(len==3){
            return 2;
        }else{
            for(int i=4;i<=len;i++){
                int max=0;
                for(int j=1;j<i;j++){
                    max=Math.max(max,dp[j]*dp[i-j]);
                }
                dp[i]=max;
            }
        }
        return dp[len];
    }
}
