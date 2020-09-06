package 笔试.美团笔试2;

import java.util.Scanner;

public class 修改大小写 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String s=cin.next();
        int d=0;
        int x=0;
        for (int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if (!Character.isUpperCase(ch)){
                d++;
            }else {
                x++;
            }
        }
        int an=Math.abs(d-x);
        System.out.println(an/2);
    }
}
