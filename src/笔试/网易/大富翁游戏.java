package 笔试.网易;

import java.util.Scanner;

public class 大富翁游戏 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n=cin.nextInt();
        cin.nextLine();
        String s=cin.nextLine();
        String[] arrs=s.split(" ");
        int[] nums = new int[arrs.length];
        for(int i=0;i<arrs.length;i++){
            nums[i] = Integer.parseInt(arrs[i]);
            //System.out.println(nums[i]);
        }
        int[] dp=new int[arrs.length];
        int max=0;
        if (dp.length>0){
            //n-=2;
            //if (n>0){
                dp[0]=nums[0];
           // }
        }
        if (dp.length>1){
            //n-=2;
            //if (n>0){
                dp[1]=nums[1];
            //}
        }
        int maxn=dp[0];
        for (int i=2;i<arrs.length;i++){

            int a=n-2;
            int b=n+2-3;
            int max1=-1;
            int max2=-1;
            if (a>=0) {
                max1=nums[i]+dp[i-1];
            }
            if (b>=0){
                max2=nums[i]+dp[i-2];
//                if (i-2>=0){
//
//                }
            }
            if (max1==-1&&max2==-1) break;
            if (max1>max2){
                dp[i]=max1;
                n=a;
            }else{
                dp[i]=max2;
                n=b;
            }
            maxn=Math.max(maxn,dp[i]);
        }
        System.out.println(maxn);
    }
}
