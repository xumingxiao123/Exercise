package 笔试.科大讯飞;

import java.util.Scanner;
import java.util.function.Function;

public class 分解质因数 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n=cin.nextInt();
        int count =2;
        helper(n,2);
    }
    public static void helper(int n,int c){
        while (c<n&&n%c!=0){
            c++;
        }
        if(c<n){
            System.out.print(c+"*");
            helper(n/c,2);
        }else {
            System.out.println(c);
        }
    }
}
