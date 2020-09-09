package 笔试.华为;

import java.util.Scanner;

public class 树的问题 {
    public static  class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { this.val = x; }
    }
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n=cin.nextInt();
        int[][] nums=new int[n][4];
        for (int i=0;i<n;i++){
            for(int j=0;j<4;j++){
                nums[i][j]=cin.nextInt();
            }
        }
        //TreeNode root;
        for (int i=0;i<n;i++){
            TreeNode root=new TreeNode(nums[i][1]);
            if (nums[i][2]!=-1){
                root.left=new TreeNode(nums[nums[i][2]][1]);
            }
            if (nums[i][3]!=-1){
                root.right=new TreeNode(nums[nums[i][3]][1]);
            }
        }
    }

}
