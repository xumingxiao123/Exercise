package 笔试.去哪儿网;

import java.util.Scanner;

public class 一期需求 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n=cin.nextInt();
        StringBuilder s1=new StringBuilder();
        StringBuilder s2=new StringBuilder();
        for (int i=0;i<n;i++){
            s1.append(cin.next());
        }
        for (int i=0;i<n;i++){
            s2.append(cin.next());
        }
        String S1=s1.toString();
        String S2=s2.toString();
        System.out.print(s1);
    }
}
