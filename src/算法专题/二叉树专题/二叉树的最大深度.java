package 算法专题.二叉树专题;

import java.util.LinkedList;
import java.util.Queue;

public class 二叉树的最大深度 {
    public static void main(String[] args) {
        //构造树1
        int[] nums1={1,3,5,2};
        int[] nums2={5,3,1,2};
        TreeNode node1=createTree.buildTree(nums1,nums2);
        TreeOperation.show(node1);
        System.out.print(maxDepth1(node1));

    }
    /*-------------------递归----------------------*/
    public static  int maxDepth(TreeNode root) {
         if(root==null){
             return 0;
         }
         //当需要携带值时候使用参数
         int left=maxDepth(root.left);
         int right=maxDepth(root.right);

         return Math.max(left,right)+1;
    }
    /*-------------------迭代----------------------*/
    public static  int maxDepth1(TreeNode root) {
        if(root==null) return 0;
        Queue<TreeNode> node=new LinkedList<>();
        node.add(root);
        int deep=0;
        int size=1;
        while(!node.isEmpty()){
            TreeNode temp=node.poll();
            size--;

            if(temp.right!=null) node.add(temp.right);
            if(temp.left!=null) node.add(temp.left);
            if(size==0){
                deep++;
                size=node.size();
            }
        }
        return deep;
    }
}
