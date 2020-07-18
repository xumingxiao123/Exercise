package leetcode;

import java.util.LinkedList;
import java.util.Queue;

import static leetcode.树的测试.createTree;

public class 二叉树的最小深度 {
    public static void main(String[] args) {
        //构造树
        TreeNode node=createTree();
        //展示树
        TreeOperation.show(node);
        //使用一个队列存储
        Queue<TreeNode> q=new LinkedList<>();
        //首先存入一个结点
        q.add(node);
        //开始遍历
        int minDeep=0;
        while(q.size()!=0){
            int size= q.size();
            minDeep++;
            for(int i=0;i<size;i++){
                TreeNode tempNode=q.poll();
                if(tempNode.left==null&&tempNode.right==null){
                    System.out.println(minDeep);
                    return;
                }
                if(tempNode.left!=null){
                    q.add(tempNode.left);
                }
                if(tempNode.right!=null){
                    q.add(tempNode.right);
                }
            }
        }
    }
}
