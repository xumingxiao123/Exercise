package 算法专题.二叉树专题;

public class 二叉树展开为链表 {
    public static void main(String[] args) {
        //构造树1
        int[] nums1={5,2,13};
        int[] nums2={2,5,13};
        TreeNode node1=createTree.buildTree(nums1,nums2);
        //展示树
        TreeOperation.show(node1);
        //调用辅助函数
        flatten(node1);
        TreeOperation.show(node1);
    }
    //将问题进行拆分,是：不去管函数的内部细节是如何处理的，我们只看其函数作用以及输入与输出
    /*-------------DFS--------------------------*/
    public static  void flatten(TreeNode root) {
         if(root==null){
             return;
         }
         //将根节点的左子树变成链表
         flatten(root.left);
        //将根节点的右子树变成链表
         flatten(root.right);
         TreeNode temp=root.right;
        //把树的右边换成左边的链表
         root.right=root.left;
         root.left=null;
         while(root.right!=null) root=root.right;
         root.right=temp;

    }
}
