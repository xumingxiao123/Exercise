package Leetcode2.二叉树专题;

public class 二叉树的最近公共祖先 {
    public static void main(String[] args) {
        //构造树1
        int[] nums1={5,2,13};
        int[] nums2={2,5,13};
        TreeNode node1=createTree.buildTree(nums1,nums2);
        //展示树
        TreeOperation.show(node1);
        //调用辅助函数
//        TreeNode node3=lowestCommonAncestor(node1,node1.left, node1.right);
        TreeOperation.show(node1);
    }
//    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//
//    }
}
