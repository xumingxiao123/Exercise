package 笔试.去哪儿网;

import java.util.Scanner;

public class 刚哥的直播 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int m=cin.nextInt();
        int n=cin.nextInt();
        System.out.print(qu(m,n));
//        if (n>m){
//            System.out.print(0);
//        }else{
//            int countX=1;
//            int countY=1;
//            for(int i=m-n+1;i<=m;i++){
//                countX=countX*i;
//            }
//            for(int j=1;j<=n;j++){
//                countY=countY*j;
//            }
//            int result=(int) countX/countY;
//            System.out.print(result);
//        }
    }
    public  static  int qu(int m,int n){
        if(m<n) return 0;
        if (n==0) return 1;
        return qu(m-1,n)+qu(m-1,n-1);
    }
}
