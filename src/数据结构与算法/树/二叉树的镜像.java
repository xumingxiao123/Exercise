package 数据结构与算法.树;
//



import java.util.Stack;

/**
 * 操作给定的二叉树，将其变换为源二叉树的镜像。
 * 思路:
 * * 先前序遍历这棵树的每个结点，如果遍历到的结点有子结点，就交换它的两个子节点，
 *   当交换完所有的非叶子结点的左右子结点之后，就得到了树的镜像
 * * 递归方法的解题思路：
 *   1) 递归算法一定有一个结束条件，不然递归会一直进行下去
 *   2) 递归算法一定会实现一定的功能
 *   3) 递归算法一定有入口
 */

public class 二叉树的镜像 {
    public TreeNode mirror(TreeNode root) {
        if(root==null) return null;
        TreeNode temp=root.left;
        root.left=mirrorTree(root.right);
        root.right=mirrorTree(temp);
        return  root;
    }
    public TreeNode mirrorTree(TreeNode root) {
        if(root==null) return null;
        Stack<TreeNode> stack =new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode node=stack.pop();
            if(node.left!=null) stack.push(node.left);
            if(node.right!=null) stack.push(node.right);
            TreeNode temp=node.right;
            node.right=node.left;
            node.left=temp;
        }
        return  root;
    }
}
