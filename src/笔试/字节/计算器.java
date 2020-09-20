package 笔试.字节;

import java.util.ArrayList;
import java.util.Scanner;
/**
 * 5
 * 1 2 +
 * 3 4 -
 * 100000000000 100000000000 *
 * 2 3 ^
 * 2 100000000000 ^
 *
 */


public class 计算器 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n=cin.nextInt();
        cin.nextLine();
        ArrayList<String[]> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            String s=cin.nextLine();
            String[] s1=s.split(" ");
            list.add(s1);
        }
        ArrayList<Long> list1=new ArrayList<>();
        for(int i=0;i<n;i++){
            String[] s2=list.get(i);
            long a= Long.parseLong(s2[0]);
            long b= Long.parseLong(s2[1]);
            long c = 0;
            if (s2[2].equals("+")){
                c=a+b;
            }
            else if (s2[2].equals("-")){
                c=a-b;
            }
            else if (s2[2].equals("*")){
                c=(a*b)%( (long)Math.pow(10, 9)+7);
            }
            else if (s2[2].equals("^")){
                c=  ((long)Math.pow(a,b)%((long)Math.pow(10, 9)+7));
            }
            list1.add(c);
        }
        for(int i=0;i<n;i++){
              System.out.println(list1.get(i));
        }


    }
}
