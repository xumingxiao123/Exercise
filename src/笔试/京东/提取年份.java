package 笔试.京东;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class 提取年份 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String s=cin.nextLine();
        ArrayList<Integer> list=new ArrayList<>();
        for (int i=0;i<s.length();i++){
            if (s.charAt(i)-'0'>=0&&s.charAt(i)-'0'<=3
                    &&i+1<s.length()&&s.charAt(i+1)-'0'>=0&&s.charAt(i+1)-'0'<=9
                    &&i+2<s.length()&&s.charAt(i+2)-'0'>=0&&s.charAt(i+2)-'0'<=9
                    &&i+3<s.length()&&s.charAt(i+3)-'0'>=0&&s.charAt(i+3)-'0'<=9){
//                if (i+4<s.length()){
                    int t=Integer.parseInt(s.substring(i,i+4),10);
                    if (t>=1000&&t<=3999){
                        list.add(t);
//                    }
                }

            }
        }
        for (int n:list){
            System.out.print(n+" ");
        }
    }
}
