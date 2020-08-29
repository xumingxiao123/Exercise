package 笔试.科大讯飞;

import java.util.Scanner;

public class 下划线2 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String s=cin.next();
        StringBuffer s1=new StringBuffer();
        int i=0;
        while (s.charAt(i)=='_') i++;
        int j=-1;
        while (i<s.length()){
            s1.append(s.charAt(i));
            i++;
            j++;
            while (i<s.length()&&s.charAt(i)=='_'&&s1.charAt(j)=='_'){
                 i++;
            }

        }
        if (s1.charAt(j)=='_'){
            s1.deleteCharAt(j);
        }
        System.out.print(s1);
    }
}
