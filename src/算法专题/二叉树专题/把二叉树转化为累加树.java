package 算法专题.二叉树专题;

import java.util.Stack;

public class 把二叉树转化为累加树 {
    public static void main(String[] args) {
        //构造树1
        int[] nums1={5,2,13};
        int[] nums2={2,5,13};
        TreeNode node1=createTree.buildTree(nums1,nums2);
        //展示树
        TreeOperation.show(node1);
        //调用辅助函数
        TreeNode node3=convertBST1(node1);
        TreeOperation.show(node1);
    }
    /*----------------------DFS------------------------*/
    static int num=0;
    public static TreeNode convertBST(TreeNode root) {
        if(root==null) return null;

        convertBST(root.right);
        //中序遍历是有序的，如果想要倒序，则反转左右节点的遍历顺顺序
        //左中右->右中左
        //注意，这里遍历的都是根节点
        root.val=num+root.val;
        num=root.val;

        convertBST(root.left);
        return root;
    }
    /*----------------------BFS------------------------*/
    public static TreeNode convertBST1(TreeNode root) {
        Stack<TreeNode> stack=new Stack<>();
        int num1=0;
        TreeNode temp=root;
        while(!stack.isEmpty()||root!=null){
            //关键点，此处要为pee
            while(root!=null){
                stack.push(root);
                root=root.right;
            }
            root=stack.pop();
            root.val=root.val+num1;
            num1=root.val;
            root=root.left;
        }
        return temp;
    }
}


