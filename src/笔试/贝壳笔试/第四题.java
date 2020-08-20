package 笔试.贝壳笔试;

import java.util.Scanner;

public class 第四题 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int m = cin.nextInt();
        int k = cin.nextInt();
        int d = cin.nextInt();
        //还原矩阵，多出来的行列存储行列之和
        int[][] a=new int [n+1][m+1];
        //导入数据，并计算每行数据和
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=0;j<m;j++){
               a[i][j]=cin.nextInt();
               sum=sum+a[i][j];
            }
            a[i][n]=sum;
        }
        //计算每列最大值
        for(int j=0;j<m;j++){
            int sum2=0;
            for(int i=0;i<n;i++){
                a[i][j]=cin.nextInt();
                sum2=sum2+a[i][j];
            }
            a[m][j]=sum2;
        }
        //测试
        for(int i=0;i<n+1;i++){
            for(int j=0;j<m+1;j++){
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
        //求最大值并记录行列数

    }
}
