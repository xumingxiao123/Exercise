package 数据结构与算法.树;



/**
 * 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。
 * 假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 * 例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
 */
public class 重建二叉树 {
    public static void main(String[] args) {
        int[] pre={1,2,4,7,3,5,6,8};
        int[] in={4,7,2,1,5,3,8,6};
        TreeNode root =reConstructBinaryTree(pre,0,pre.length-1,in,0,in.length-1);
        TreeOperation.show(root);
        //ArrayList list=之字型打印二叉树.print(root);
        //for(Object i : list){
        //System.out.println(i);
        //}
        System.out.println("二叉树的前序遍历");
        二叉树的非递归遍历.iterativePostOrder(root);

    }
    private  static  TreeNode reConstructBinaryTree(int[] pre,int startpre,int endpre,int [] in,int startin ,int endin){
        if(startpre>endpre||startin>endin){
            return null;
        }
        TreeNode root =new TreeNode(pre[startpre]);

        for(int i=startpre;i<=endin;i++){
            if(in[i]==pre[startpre]){
                //startpre+1+i-startin这里要减去startin
                root.left=reConstructBinaryTree(pre,startpre+1,startpre+1+i-startin,in,startin,i-1);
                root.right=reConstructBinaryTree(pre,i+startpre+1-startin,endpre,in,i+1,endin);
                break;
            }
        }
        return root;
    }
}
