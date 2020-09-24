public class Solution {

    public static void main(String[] args) {
        System.out.print(helper(15));
        //System.out.print(helper2(5));

    }
    //找出最大序列
    public  static  int   helper(int n){
        int max=0;
        int[] dp=new int[n+1];
        for (int i=2;i<=n;i++){
            if (!helper2(i)){
                dp[i]=1;
            }else{
                dp[i]=0;
            }
        }
        //是素数
        for (int i=2;i<=n;i++){
           if (dp[i]!=0){
               dp[i]=dp[i-1]+1;
               max=Math.max(max,dp[i]);
           }
        }
        return  max;
    }
    //看是不是素数
    public  static  boolean  helper2(int k){

        for (int i=2;i<=Math.sqrt(k);i++){
            //不是素数
            if (k%i==0) return false;
        }
        return  true;
    }
}
