package 数据结构与算法.字符串;

import java.util.Scanner;

public class 找第一个不重复字符 {
    public static void main(String[] args) {
        //“google"中找l
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int arr[]=new int[256];
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'a']++;
        }
        for(int i=0;i<s.length();i++){
            if(arr[s.charAt(i)-'a']==1) {
                System.out.println(s.charAt(i));
                break;
            }
        }
    }
}
