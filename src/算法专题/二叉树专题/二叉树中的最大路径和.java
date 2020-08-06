package Leetcode2.二叉树专题;

public class 二叉树中的最大路径和 {
    public static void main(String[] args) {
        //构造树1
        int[] nums1={1,3,5,2};
        int[] nums2={5,3,1,2};
        TreeNode node1=createTree.buildTree(nums1,nums2);
        TreeOperation.show(node1);
        System.out.print(maxPathSum(node1));

    }
    /*-----------------DFS------------------*/
    static int maxSum = Integer.MIN_VALUE;
    public static  int maxPathSum(TreeNode root) {
        getMax(root);
        return maxSum;
    }
    private static int getMax(TreeNode root) {
        if(root==null){
            return 0;
        }
        int left=Math.max(0,getMax(root.left));
        int right=Math.max(0,getMax(root.right));
        //节点的最大路径和取决于该节点的值与该节点的左右子节点的最大贡献值
        maxSum=Math.max(maxSum ,left+right+root.val);
        return Math.max(left,right)+root.val;
    }
}
