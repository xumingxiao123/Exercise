package 数据结构与算法.树;


import java.util.Stack;

public class 二叉树的深度 {
    public  static  int  treeDeep1 (TreeNode root){
        if(root==null) return 0;
        int left=treeDeep1(root.left);
        int right=treeDeep1(root.right);
        return (left>right?left:right)+1;
    }
    public  static int treeDeep2(TreeNode root){
        Stack<TreeNode> stack1=new Stack<>();
        stack1.push(root);
        int count=1;
        int deep=0;
        int nextcount=0;
        while(!stack1.isEmpty()){
            TreeNode node=stack1.pop();
            count--;
            if(node.left!=null){
                stack1.push(node.left);
                nextcount++;
            }
            if(node.right!=null){
                stack1.push(node.right);
                nextcount++;
            }
            if(count==0){
                deep++;
                count=nextcount;
                nextcount=0;
            }
        }
        return deep;
    }
}
