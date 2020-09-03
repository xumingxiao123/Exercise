package 笔试.其他笔试;

import java.util.Scanner;

public class 牛牛和爷爷 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int N=cin.nextInt();
        int M=cin.nextInt();
        int P=cin.nextInt();
        int[][] nums=new int[N+1][N+1];
        for (int i=0;i<M;i++){
            int a=cin.nextInt();
            int b=cin.nextInt();
            int c=cin.nextInt();
            nums[a][b]=c;
        }
        for (int j=0;j<P;j++){
            int start=cin.nextInt();
            int end=cin.nextInt();

        }
        for (int j=0;j<P;j++){
            System.out.println(-1);
        }
    }
}
