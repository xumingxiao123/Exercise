package 笔试.华为;

import java.util.Scanner;

public class 岛屿问题 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int m=cin.nextInt();
        int n=cin.nextInt();
        int[][] nums=new int[m][n];
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                nums[i][j]=cin.nextInt();
            }
        }
        System.out.println(helper(nums));
    }
    private  static  int helper(int[][] matrix){
        if (matrix==null||matrix.length==0||matrix[0].length==0) return 0;
        int r=matrix.length;
        int c=matrix[0].length;
        int[][] dp=new int[r][c];
        int res=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                res=Math.max(res,DFS(matrix,i,j,Integer.MIN_VALUE,dp));
            }
        }
        return  res;
    }

    private static int DFS(int[][] matrix, int i, int j, int maxValue, int[][] dp) {
        int r=matrix.length;
        int c=matrix[0].length;
        if(i<0||i>=r||j<0||j>=c||matrix[i][j]<=maxValue){
            return 0;
        }
        if (dp[i][j]!=0){
            return dp[i][j];
        }
        int max=0;
        max=Math.max(max,DFS(matrix,i-1,j,matrix[i][j],dp));
        max=Math.max(max,DFS(matrix,i+1,j,matrix[i][j],dp));
        max=Math.max(max,DFS(matrix,i,j-1,matrix[i][j],dp));
        max=Math.max(max,DFS(matrix,i,j+1,matrix[i][j],dp));
        dp[i][j]=max+1;
        return max+1;
    }

}
