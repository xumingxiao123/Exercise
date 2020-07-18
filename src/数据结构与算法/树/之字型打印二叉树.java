package 数据结构与算法.树;



import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class 之字型打印二叉树 {
    public static ArrayList<Integer> print (TreeNode root){
        Stack<TreeNode> stack=new Stack<>();
        Queue<TreeNode> queue=new LinkedList<>();
        ArrayList<Integer> list=new ArrayList<>();
        stack.push(root);
        //有一个不为空则继续
        while (!stack.isEmpty()||queue.size()!=0){
            //栈循环入队
            while (!stack.isEmpty()){
                TreeNode node=stack.pop();
                if(node.left!=null)queue.add(node.left);
                if(node.right!=null)queue.add(node.right);
                list.add(node.val);
            }
            //队循环入栈
            while (queue.size()!=0){
                TreeNode node=queue.remove();
                if(node.left!=null)stack.add(node.left);
                if(node.right!=null)stack.add(node.right);
                list.add(node.val);
            }
        }
        return list;
    }
}
