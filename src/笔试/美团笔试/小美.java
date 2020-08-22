package 笔试.美团笔试;

import java.util.Scanner;

public class 小美 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        long[] nums1=new long [n];
        long[] nums2=new long [n];
        for (int i=0;i<nums1.length;i++){
            nums1[i]=cin.nextInt();
        }
        for (int j=0;j<nums2.length;j++){
            nums2[j]=cin.nextInt();
        }
        for (int i=0;i<nums1.length;i++){
            long sumLeft=0;
            long sumRight=0;
            nums1[(int) nums2[i]-1]=0;
            for (long left=0;left<nums2[i]-1;left++){
                sumLeft=sumLeft+nums1[(int)left];
            }
            for (long right=nums2[i];right<nums1.length;right++){
                sumRight=sumRight+nums1[(int)right];
            }
            if (sumRight>sumLeft){
                System.out.println(sumRight);
            }else{
                System.out.println(sumLeft);
            }
        }
    }
}
