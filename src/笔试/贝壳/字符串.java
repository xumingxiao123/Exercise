package 笔试.贝壳;

import java.util.Scanner;

public class 字符串 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        String str=scan.next();
        int m=maxlength(str);
        int i=0;
        if(m==0){
            i=0;
        }else {
            i=m+(str.length()-2*m)+1;
        }
        System.out.println(i);
    }

    private static int maxlength(String str) {
        int max=0;
        for(int i=0;i<str.length()/2;i++){
            String c1=str.substring(0,i+1);
            String c2=str.substring(i+1,2*(i+1));
            if(c1.equals(c2)){
                int temp=i+1;
                if(temp>max) max=temp;
            }
        }
        return max;
    }
}
