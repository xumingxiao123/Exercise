package 笔试.同城;

import java.util.Scanner;

public class 最大金额 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String s=cin.nextLine();
        String s1=s.substring(1,s.length()-1);
        String[] strs = s1.split(",");
        int[] num = new int[strs.length];
        for(int i=0; i<strs.length; i++){
            num[i] = Integer.valueOf(strs[i]);
        }
        int i=0;
        int j=num.length-1;
        int n=5;
        int sum=0;
        while (n>0){
            if (num[i]>num[j]){
                sum=sum+num[i];
                i++;
            }else{
                sum=sum+num[j];
                j--;
            }
            n--;
        }
        System.out.print(sum);
    }
}
