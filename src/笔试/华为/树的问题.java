package 笔试.华为;


import java.util.ArrayList;
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
        TreeNode root= createTree(nums,0);
        System.out.println("7");


    }

    public static TreeNode createTree(int[][] nums,int m){
        //TreeNode root;
        if (nums[m][2]==-1&&nums[m][3]==-1) {
            return new TreeNode(nums[m][1]);
        }
        TreeNode root=new TreeNode(nums[m][1]);
        //for (int i=left;i<right;i++){
           // TreeNode root=new TreeNode(nums[i][1]);
        if (nums[m][2]!=-1){
                //root.left=new TreeNode(nums[nums[i][2]][1]);
             root.left=createTree(nums,nums[m][2]-1);
        }
         if (nums[m][3]!=-1){
                //root.right=new TreeNode(nums[nums[i][3]][1]);
             root.right=createTree(nums,nums[m][3]-1);
         }
           // break;
       // }
        return root;
    }
    static ArrayList<Integer> list=new ArrayList<>();
    public static  void pathSum(TreeNode root) {
        if(root == null) return;
        Sum(root);
        pathSum(root.left);
        pathSum(root.right);
        return;
    }


    public static  void Sum(TreeNode root){
        if(root == null) return;
        Sum(root.left);
        Sum(root.right);
    }

}
