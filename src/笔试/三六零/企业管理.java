package 笔试.三六零;

import java.util.Scanner;

public class 企业管理 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int m=cin.nextInt();
        int n=cin.nextInt();
        int[][] nums=new int[n][2];
        for (int i=0;i<n;i++){
            nums[i][0]=cin.nextInt();
            nums[i][1]=cin.nextInt();
        }
        int left=-1;
        int right=-1;
        for (int i=0;i<n;i++){
            if (nums[i][1]==1){
                left=nums[i][0];
                break;
            }
        }
        for (int i=n-1;i>=0;i--){
            if (nums[i][1]==0){
                right=nums[i][0];
                break;
            }
        }
        for (int i=1;i<=m;i++){
            if (i<left||i>right){
                System.out.println(i);
            }
        }
    }
}
