package 数据结构与算法.树;



import java.util.ArrayList;

public  class 层次打印二叉树 {
    public static ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
       ArrayList<Integer> list=new ArrayList<>();
        ArrayList<TreeNode> queue = new ArrayList<>();
        queue.add(root);
       while(queue.size() != 0){
           TreeNode node=queue.remove(0);
           if(node.left!=null) queue.add(node.left);
           if(node.right!=null) queue.add(node.right);
           list.add(node.val);
       }
        return  list ;
    }

}
