package 笔试.网易;

import java.util.Scanner;

public class 字符串 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String s=cin.next();
        int left=0;
        int right=0;
        for (int i=0;i<s.length();i++){
            if (s.charAt(i)=='1') right=right+2;
            if (s.charAt(i)=='0') right=right+1;
        }
        int max=right;
        for (int i=0;i<s.length();i++){
            if (s.charAt(i)=='1'){
                right=right-2;
                left=left+1;
            }
            if (s.charAt(i)=='0'){
                right=right-1;
                left=left+2;
            }
            max=Math.max(max,left+right);
        }
        System.out.println(max);
    }
}
