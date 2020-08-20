package 笔试.贝壳笔试;

import java.util.Scanner;

public class 方格 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int[][] nums=new int [3][n];
        for(int i=0;i<n;i++){
            nums[0][i]=cin.nextInt();
            nums[1][i]=cin.nextInt();
            if(nums[0][i]%2==0||nums[1][i]%2==0){
                nums[2][i]=2;
            }else{
                nums[2][i]=Math.max(nums[0][i],nums[1][i]);
            }
        }
        for(int j=0;j<n;j++){
            System.out.println(nums[2][j]);
        }
    }
}
