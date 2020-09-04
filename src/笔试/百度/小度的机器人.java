package 笔试.百度;

import java.util.Scanner;

public class 小度的机器人 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int m=cin.nextInt();
        int n=cin.nextInt();
        String s=cin.next();
        int len=s.length();
//        int m=0;
//        int n=0;
        for(int i=0;i<len;i++){
            if (s.charAt(i)=='U'){
              m--;
            }
            if (s.charAt(i)=='D'){
              m++;
            }
            if (s.charAt(i)=='L'){
              n--;
            }
            if (s.charAt(i)=='R'){
              n++;
            }
        }
        System.out.print(m+" "+n);
    }
}
