package Leetcode2.二叉树专题;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class 对称二叉树 {
    public static void main(String[] args) {
        //构造树1
        int[] nums1={1,2,3,4,2,4,3};
        int[] nums2={3,2,4,1,4,2,3};
        TreeNode node1=createTree.buildTree(nums1,nums2);
        //展示树
        TreeOperation.show(node1);
        //调用辅助函数
        boolean value=isSymmetric1(node1);
        if(value){
            System.out.print("true");
        }else{
            System.out.print("false");
        }
        //TreeOperation.show(value);
    }
    //1. 它们的两个根结点具有相同的值
    //2. 每个树的右子树都与另一个树的左子树镜像对称
    /*---------------------DFS------------------------*/
    public static boolean isSymmetric(TreeNode root) {
        return check(root,root);
    }
    public static boolean check(TreeNode p, TreeNode q) {
        //如果没有结点，自然为true
        if(p==null&&q==null){
            return  true;
        }
        //如果有一个为null，则false
        if(p==null||q==null){
            return  false;
        }
        //否则判断值&&左结点的左结点值和右结点的右结点值&&左结点的右结点值和右结点的左结点值
        return  p.val==q.val&&check(p.left,q.right)&&check(p.right,q.left);
    }
    /*---------------------BFS------------------------*/
    public static boolean isSymmetric1(TreeNode root) {
        return check1(root,root);
    }
    public static boolean check1(TreeNode p, TreeNode q) {
        //先存入一个队列中
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(p);
        queue.add(q);
        while(!queue.isEmpty()){
            TreeNode left=queue.poll();
            TreeNode right=queue.poll();
            if(left==null&&right==null){
                continue;
            }
            if(left==null||right==null||left.val!=right.val){
                return  false;
            }
            queue.add(left.left);
            queue.add(right.right);

            queue.add(left.right);
            queue.add(right.left);
        }
        return  true;
    }
}
