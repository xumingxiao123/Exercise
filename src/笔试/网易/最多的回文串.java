package 笔试.网易;

import java.util.Scanner;

public class 最多的回文串 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String s=cin.next();
        int count=0;
        for (int i=0;i<s.length();i++){
            if (i+1<s.length()&&s.charAt(i)==s.charAt(i+1)){
                count++;
            }
            int left=i-1;
            int right=i+1;
            while (left>=0&&right<=s.length()-1&&s.charAt(left)==s.charAt(right)){
                count++;
                left--;
                right++;

            }

        }
        System.out.print(count);
    }
}
