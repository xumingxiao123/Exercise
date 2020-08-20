package 笔试.赛码网;
/*
在机器学习中有一种流行的池化操作，而在池化操作中，3*3极大值池化应用十分广泛。什么是3*3极大值池化呢？
设原矩阵是n*m的，则3*3极大值池化就是枚举矩阵中的所有3*3的子矩阵,分别求最大值并顺次拼接而成，处理过后的矩阵是(n-2)*(m-2)。
例如，原矩阵是[[1,2,3,4],[5,6,7,8],[9,10,11,12]],经过池化之后就变成[[11,12]]。
为了提高难度，选择的滑动窗口并不是3*3的，而是a*b的，由于输入可能是非常大的。
原n*m的矩阵权值由以下公式计算得到，h(i,j)=i*j mod 10。(1<=i<=n,1<=j<=m)
由于输出矩阵也是一个很麻烦的事情，因此你只需输出经过a*b池化处理后的矩阵的元素之和即可。
输入：第一行包含四个正整数，n,m,a,b，分别表示原矩阵的行列数量和滑动窗口的行列数量。(1<=n,m,a,b<=1000)
输出：仅包含一个整数，即新矩阵的元素之和。
样例输入
4 5 3 3
样例输出
54
* */

import java.util.Scanner;

public class 滑动窗口 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a = sc.nextInt();
        int b= sc.nextInt();
        //构造数组
        if(n==0||m==0||a==0||b==0||a>n||b>m){
            System.out.println(0);
            return ;
        }
        int nm[][] =new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                nm[i][j]=((i+1)*(j+1))%10;
            }
        }
        /*
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.println(nm[i][j]);
            }
        }
        * */
        int sum=0;
        //int temp[][] =new int[n-a+1][m-a+1];
        for(int x=0;x<n-a+1;x++){
            for(int y=0;y<m-a+1;y++){
             int max=nm[0][0];
             for(int i=x;i<a;i++){
                for(int j=y;j<b;j++){
                    max=Math.max(max,nm[i][j]);
                }
            }
           sum=sum+max;
           // temp[x][y] =max;
        }
        }
        //int sum=0;
        //for(int i=0;i<n-a+1;i++){
       //     for(int j=0;j<m-a+1;j++){
        //        sum=sum+temp[i][j];
        //    }
        //}
        System.out.println(sum);
       // int ab[][] =new int[a][b];
}
}

