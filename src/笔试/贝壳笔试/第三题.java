package 笔试.贝壳笔试;

import java.util.Scanner;

public class 第三题 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=cin.nextInt();
        }
        int[] result=new int[n];
        for (int j=0;j<n;j++){
            int sum=1;
            int k=1;
            while(sum<nums[j]){
                sum=sum+(sum+1);
                k++;
            }
            result[j]=k;
        }
        for (int m=0;m<n;m++){
            System.out.println(result[m]);
        }

    }
}
