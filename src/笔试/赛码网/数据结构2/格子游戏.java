package 笔试.赛码网.数据结构2;
/*
有n个格子，从左到右放成一排，编号为1-n。
共有m次操作，有3种操作类型：
1.修改一个格子的权值，
2.求连续一段格子权值和，
3.求连续一段格子的最大值。
对于每个2、3操作输出你所求出的结果。
输入
输入第一行两个整数，n表示格子个数，m表示操作次数，n和m中间用空格隔开；
接下来输入n行，每行一个整数表示一个格子的权值
接下来输入m行，每行有三个整数，中间用空格隔开；第一个是选择的操作类型1-3,第二和第三个整数是操作格子的编号。
样例输入
3 3
7
8
9
2 1 3
3 1 3
2 1 2
输出
若执行1操作则无输出
若执行2和3操作则输出一个整数
样例输出
24
9
15
* */

import java.util.Scanner;

public class 格子游戏 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] w = new int [n];
        for(int i=0;i<n;i++){
            w[i] = in.nextInt();
        }

        int op,n1,n2;
        for(int j=0;j<m;j++){
            op = in.nextInt();
            n1 = in.nextInt();
            n2 = in.nextInt();

            if(op==1)
                w[n1-1]=n2;
            if(op==2){
                int sum = 0;
                for(int k=n1-1;k<n2;k++)
                    sum+=w[k];
                System.out.println(sum);
            }
            if(op==3){
                int max = w[n1-1];
                for(int k=n1;k<n2;k++)
                    max = w[k]>max ? w[k]: max;
                System.out.println(max);
            }
        }
    }
}