package 数据结构与算法.树;



import java.util.Stack;


public class 二叉树的非递归遍历 {
    //前序遍历： 根节点，左节点，右节点
    public static void iterativePreOrder(TreeNode p){
        Stack<TreeNode> stack=new Stack<>();
        stack.push(p);
        while(!stack.isEmpty()){
            TreeNode node=stack.pop();
            System.out.println(node.val);
            if(node.right!=null) stack.push(node.right);
            if(node.left!=null) stack.push(node.left);
        }
    }
//前序遍历手算的思想，先变访问边找，找到最左下方的，然后向上再向访问右边的
    public static void iterativePreOrder_1(TreeNode p) {
        if (p == null) return;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        while (!stack.empty() || p != null) {
            while (p != null) {
                System.out.println(p.val);
                stack.push(p);
                p = p.left;
            }
            p = stack.pop();
            p = p.right;
        }
    }
//中序遍历手算的思想： 左节点，根节点，右节点
    public static void iterativeInOrder(TreeNode p) {
        Stack<TreeNode> stack=new Stack<>();
       // stack.push(p);
        while(!stack.isEmpty()||p!=null){
            //先找到最左边结点，并依次入栈
            while (p!=null){
                stack.push(p);
                p=p.left;
            }
            p=stack.pop();
            System.out.print(p.val+",");
           // if (p.right!=null) stack.push(p.right);
            p=p.right;
        }
    }
    //后序遍历： 左节点，右节点，根节点
    //这里也是手算的思想。
    public static void iterativePostOrder(TreeNode p) {
      Stack<TreeNode> stack=new Stack<>();
      TreeNode prev=p;
      while (!stack.isEmpty()||p!=null){
          while(p!=null){
              stack.push(p);
              p=p.left;
          }
          p = stack.peek().right;
          //若栈顶节点的右节点为空或者已经visit过，则按顺序应该访问栈顶节点
          if (p == null || p == prev) {
              p = stack.pop();
              System.out.print(p.val+",");
              //prev用来标记已经visit过这个节点
              prev = p;
              p = null;
          }
      }
    }
}
