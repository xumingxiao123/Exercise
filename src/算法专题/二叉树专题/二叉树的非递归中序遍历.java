package Leetcode2.二叉树专题;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class 二叉树的非递归中序遍历 {
    public static void main(String[] args) {
        //构造树1
        int[] nums1={1,3,5,2};
        int[] nums2={5,3,1,2};
        TreeNode node1=createTree.buildTree(nums1,nums2);
        TreeOperation.show(node1);
        List<Integer> list=inorderTraversal(node1);
        for(Integer n:list){
            System.out.println(n);
        }
    }
/*-----------------全是细节的手算非递归遍历-------------------------------------*/
    public  static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list =new ArrayList<>();
        Stack<TreeNode> stack=new Stack<>();
        //stack.push(root);
        //TreeNode node=stack.peek();
        //root!=null是精髓，如果右结点为null，则不继续下面循环，可以防止重复遍历
        while(!stack.isEmpty()||root!=null){
            //如何解决重复搜索？
            while(root!=null){
                stack.push(root);
                root=root.left;
            }
            root=stack.pop();
            list.add(root.val);
            //全是细节啊！！！！！！
            root=root.right;
        }
        return  list;
    }
}
