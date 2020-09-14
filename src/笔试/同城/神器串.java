package 笔试.同城;

import java.util.Scanner;

class 神奇串 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str= sc.nextLine();
        int low=0,high=0;
        int i=0;
        int g=0;
        int maxlength=0;
        while(i<str.length()){
            int temp=str.charAt(i)-'0';
            if(temp >=5&& temp <=8){
                g=i;
                while(g<str.length()&&str.charAt(g)-'0'>=5&&str.charAt(g)-'0'<=8){
                    g++;
                }
                if(g-i>high-low){
                    high=g;
                    low=i;
                }
                i=g;
            }else{
                i++;
            }
        }
        System.out.println(str.substring(low,high));
    }

}
