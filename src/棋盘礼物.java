import java.util.Scanner;

public class 棋盘礼物 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String s=cin.next();
        //System.out.println(s);
        int M =s.charAt(0)-'0';
        int N = s.charAt(2)-'0';
        int[][] nums=new int[M][N];
        int[][] dp=new int[M][N];
        for(int i=0;i<M;i++){
            for(int j=0;j<N;j++){
              nums[i][j]=cin.nextInt();
            }
        }
        //System.out.println(nums[2][2]);
        dp[0][0]=nums[0][0];
        for (int m=1;m<M;m++){
           dp[m][0]=dp[m-1][0]+nums[m][0];
        }
        for (int n=1;n<N;n++){
            dp[0][n]=dp[0][n-1]+nums[0][n];
        }
        //System.out.println(dp[2][0]);
        for(int i=1;i<M;i++){
            for(int j=1;j<N;j++){
                dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1])+nums[i][j];
            }
        }
        System.out.print(dp[M-1][N-1]);

    }
}
