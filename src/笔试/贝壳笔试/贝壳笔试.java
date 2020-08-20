package 笔试.贝壳笔试;

import java.util.Scanner;

//4 acac
public class 贝壳笔试 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        String temp=cin.next();
        char[] c=temp.toCharArray();

//        for(int i=0;i<n;i++){
//            char temp=cin.next().charAt(0);
//            c[i]=temp;
//        }
        int left=0,right=n-1;
        int count=0;
        while(left<right){
            if(c[left]!=c[right]){
                count++;
            }
            left++;
            right--;
        }
        System.out.print(count);
    }
}
