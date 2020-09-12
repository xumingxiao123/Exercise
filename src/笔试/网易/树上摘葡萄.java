package 笔试.网易;

import java.util.ArrayList;
import java.util.Scanner;

public class 树上摘葡萄 {
//    public static class TreeNode {
//    int val;
//    TreeNode left;
//    TreeNode right;
//    TreeNode(int x) { this.val = x; }
//    }
    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);
        int n=cin.nextInt();
        int m=cin.nextInt();
        cin.nextLine();
        ArrayList<String> list=new ArrayList<>();
        ArrayList<Character> list1=new ArrayList<>();
        //System.out.println(cin.nextLine());
        for (int i=0;i<m;i++){
            String s=cin.nextLine();
            list.add(s);
            list1.add(s.charAt(0));
        }
//
//        System.out.println(list.get(0));
//        for (int i=0;i<n;i++){
//            //list1.add(list.get(i).charAt(0));
//           // System.out.println(list1.get(i));
//        }
        int i=0;
        //for (int i=0;i<n;i++){
        int count=0;

        while (i<list.size()){
            String s=list.get(i);
            char root=s.charAt(0);
            char left=s.charAt(s.length()-1);
            if (i+1<=list.size()-1&&root==list.get(i+1).charAt(0)){
                char right=list.get(i+1).charAt(s.length());
                if (!list1.contains(left)&&!list1.contains(right)) count++;
                i++;
            }
            i++;
        }
        System.out.println(count);

       // }

    }
}
