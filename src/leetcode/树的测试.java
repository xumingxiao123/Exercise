package leetcode;



public class 树的测试 {
    public static void main(String[] args) {
        //构造树
        TreeNode node=createTree();
        //展示树
        TreeOperation.show(node);


    }

    public static  TreeNode   createTree(){
        TreeNode a = new TreeNode(1);
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(3);
        TreeNode d = new TreeNode(4);
        TreeNode e = new TreeNode(5);
        TreeNode f = new TreeNode(6);
        TreeNode g = new TreeNode(7);
        a.left = b;
        a.right = c;
        b.right = d;
        c.left = e;
        c.right = f;
        f.left = g;
        return a;
    }
}
