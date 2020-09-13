package 笔试.滴滴笔试;

import java.util.Arrays;
import java.util.Scanner;

public class 破解X星文的密文 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String s=sc.nextLine();
        char[] chars=s.toCharArray();
        int i=0;
       // for (int i=0;i<s.length();){
            while (i<s.length()){
            if (i+n-1<s.length()){
                reverse(chars,i,i+n-1);
            }else {
                reverse(chars,i,s.length()-1);
            }
                i=i+n;
        }
        StringBuffer stringBuffer=new StringBuffer();
        for (i=0;i<s.length();i++){
            stringBuffer.append(chars[i]);
        }
        System.out.print(stringBuffer.toString());
    }
    public  static  void reverse(char[] chars,int i,int j){
        while(i<j){
            char temp=chars[i];
            chars[i]=chars[j];
            chars[j]=temp;
            i++;
            j--;
        }
    }
}
