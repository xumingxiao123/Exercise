package 笔试.最右;

import java.util.Scanner;

public class 二叉搜索树 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n=cin.nextInt();
        if (n<1||n>15){
            System.out.print(0);
        }else {
            int[] nums=new int[n+1];
            nums[0]=1;
            nums[1]=1;
            for(int i=2;i<=n;++i){
                for(int j=1;j<=i;j++){
                    nums[i]+=nums[j-1]*nums[i-j];
                }
            }
            System.out.print(nums[n]);
        }
    }
}
