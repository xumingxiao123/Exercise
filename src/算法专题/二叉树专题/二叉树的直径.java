package 算法专题.二叉树专题;



public class 二叉树的直径 {
    public static void main(String[] args) {
        //构造树1
        int[] nums1={1,2,4,5,3};
        int[] nums2={4,2,5,1,3};
        TreeNode node1=createTree.buildTree(nums1,nums2);
        TreeOperation.show(node1);
        System.out.println(diameterOfBinaryTree(node1));

    }
    //不一定经过根节点
    //首先我们知道一条路径的长度为该路径经过的节点数减一，所以求直径（即求路径长度的最大值）等效于求路径经过节点数的最大值减一。
    //而任意一条路径均可以被看作由某个节点为起点，从其左儿子和右儿子向下遍历的路径拼接得到。
    /*-------------------------DFS-------------------------*/
    static int ans;
    public static int diameterOfBinaryTree(TreeNode root) {
        ans = 1;
        depth(root);
        return ans;
    }
    public static int depth(TreeNode node) {
        if (node == null) return 0; // 访问到空节点了，返回0
        int L = depth(node.left); // 左儿子为根的子树的深度
        int R = depth(node.right); // 右儿子为根的子树的深度
        //与求最大深度不同的是，这里要记录每个节点为起点的最大长度
        ans = Math.max(ans, L+R); // 计算d_node即L+R+1 并更新ans
        return Math.max(L, R)+1; // 返回该节点为根的子树的深度
    }
}
