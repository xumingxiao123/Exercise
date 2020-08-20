package 算法专题.二叉树专题;


import java.util.Stack;

public class 合并二叉树 {
    public static void main(String[] args) {
        //构造树1
        int[] nums1={1,3,5,2};
        int[] nums2={5,3,1,2};
        TreeNode node1=createTree.buildTree(nums1,nums2);
        //构造树2
        int[] nums3={2,1,4,3,7};
        int[] nums4={1,4,2,3,7};
        TreeNode node2=createTree.buildTree(nums3,nums4);
        //展示树
        TreeOperation.show(node1);
        TreeOperation.show(node2);
        //调用辅助函数
        TreeNode node3=mergeTrees2(node1,node2);
        TreeOperation.show(node3);
    }
    /*---------------------------递归----------------------------*/
    public static  TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        //关键点：如果某一个为空，则直接返回另外一个，另外一个不管为不为空都可以
        if (t1 == null)
            return t2;
        //关键点：如果某一个为空，则直接返回另外一个，另外一个不管为不为空都可以
        if (t2 == null)
            return t1;
        t1.val += t2.val;//精髓，两个相加，都不为空的话
        t1.left=mergeTrees(t1.left,t2.left);
        t1.right=mergeTrees(t1.right,t2.right);

        return t1;
    }
    /*---------------------------迭代----------------------------*/
    public static  TreeNode mergeTrees2(TreeNode t1, TreeNode t2) {
        Stack<TreeNode[]> stack =new Stack<>();
        stack.push(new TreeNode[]{t1,t2});
        while(!stack.isEmpty()){
            TreeNode[] node =stack.pop();
            //关键点：如果此时t2为null，说明不会再相加了。
            if(node[0]==null||node[1]==null){
                continue;
            }
            node[0].val=node[0].val+node[1].val;
            //如果为空，则直接赋值t2对应结点
            if(node[0].left==null){
                node[0].left=node[1].left;
            //否则，要入栈继续迭代
            }else{
                stack.push(new TreeNode[]{node[0].left,node[1].left});
            }
            if(node[0].right==null){
                node[0].right=node[1].right;
            }else{
                stack.push(new TreeNode[]{node[0].right,node[1].right});
            }
        }
        return t1;
    }

}
