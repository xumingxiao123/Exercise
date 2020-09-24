import java.util.Arrays;
import java.util.Stack;

public class 练习 {

    class TreeNode{
       int val;
       TreeNode left;
       TreeNode right;
       TreeNode(int x){
           this.val=x;
       }
    }
    private  static void helper1(TreeNode root){

        Stack<TreeNode> stack= new Stack<>();
        //stack.push(root);
        TreeNode pre=root;
        while (!stack.isEmpty()||root!=null){
            while (root!=null){
                stack.push(root);
                root=root.left;
            }
            root=stack.peek().right;
            if (root==null||pre==root){
                root=stack.pop();
                pre=root;
                root=null;
            }
//            root=stack.pop();
//            root=root.right;
        }
    }
    public static void main(String[] args) {
        int[] arr={5,4,7,8,9,4,6,1,4};
        int n=quickSort(arr,0,arr.length-1,5-1);

        System.out.print(n);
    }


    private static  int quickSort(int[] arr , int low, int high, int k){
        int i=low;
        int j=high;
        if(i<j){
            int temp=arr[i];
           while(i<j){
               while (i<j&&arr[j]>temp){
                   j--;
               }
               if (i<j){
                   arr[i]=arr[j];
                   i++;
               }
               while (i<j&&arr[i]<temp){
                    i++;
               }
               if (i<j){
                   arr[j]=arr[i];
                   j--;
               }
           }
           arr[i]=temp;
           if (i==k){
               return arr[i];
           }
           else if (i>k){
               quickSort(arr,low,i-1,k);
           }
           else{
               quickSort(arr,i+1,high,k);
           }

        }
        return -1;
    }
}
