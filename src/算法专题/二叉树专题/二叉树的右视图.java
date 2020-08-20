package 算法专题.二叉树专题;

import java.util.ArrayList;
import java.util.List;

public class 二叉树的右视图 {
    public static void main(String[] args) {
        //构造树1
        int[] nums1={1,2,5,3,4};
        int[] nums2={2,5,1,3,4};
        TreeNode node1=createTree.buildTree(nums1,nums2);
        TreeOperation.show(node1);
        List<Integer> list=rightSideView(node1);
        for(Integer n:list){
            System.out.println(n);
        }

    }
    /*-------------------------DFS----------------------------*/
    static  ArrayList<Integer> res = new ArrayList<>();
    public static  List<Integer> rightSideView(TreeNode root) {
          dfs(root, 0); // 从根节点开始访问，根节点深度是0
          return res;
     }
     private static void dfs(TreeNode root, int depth) {
          if (root == null) {
          return;
       }
        // 先访问 当前节点，再递归地访问 右子树 和 左子树。
      if (depth == res.size()) {   // 如果当前节点所在深度还没有出现在res里，说明在该深度下当前节点是第一个被访问的节点，因此将当前节点加入res中。
      res.add(root.val);
       }
         depth++;
      //System.out.println(depth);
      dfs(root.right, depth);
      dfs(root.left, depth);
       }
  }
