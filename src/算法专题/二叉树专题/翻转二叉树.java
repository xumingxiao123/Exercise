package Leetcode2.二叉树专题;

import java.util.Stack;

public class 翻转二叉树 {
    public static void main(String[] args) {
        //构造树1
        int[] nums1={4,2,1,3,7,6,9};
        int[] nums2={1,2,3,4,6,7,9};
        TreeNode node1=createTree.buildTree(nums1,nums2);
        //展示树
        TreeOperation.show(node1);
        //调用辅助函数
        TreeNode node3=invertTree2(node1);
        TreeOperation.show(node1);
    }
    /*---------------------DFS-----------------------*/
    public static TreeNode invertTree(TreeNode root) {

        if(root==null){
            return null;
        }

        invertTree(root.left);
        invertTree(root.right);

        TreeNode temp=root.left;
        root.left=root.right;
        root.right=temp;
        return root;
    }
    /*---------------------BFS-----------------------*/
    public static TreeNode invertTree2(TreeNode root) {
        Stack<TreeNode> stack=new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode node=stack.pop();
            TreeNode temp=node.left;
            node.left=node.right;
            node.right=temp;
            if(node.left!=null) stack.push(node.left);
            if(node.right!=null) stack.push(node.right);
        }
        return root;
    }
}
