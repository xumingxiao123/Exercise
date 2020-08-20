package 算法专题.链表专题;

import java.util.ArrayList;

public class 回文链表 {
    public static void main(String[] args) {
        //创建链表
        int[] nums1={1,2,2,1};
        ListNode head=createListNode.helper(nums1);
        ListNode next=head;
        System.out.print("正序打印链表1结果:");
        while(next!=null){
            System.out.print(next.val+" ");
            next=next.next;
        }
        if(isPalindrome(head)){
            System.out.print("true");
        }else {
            System.out.print("false");
        }

    }
    /*------------1. 将值复制到数组列表,然后判断--------------*/
    public static  boolean isPalindrome(ListNode head) {
        ArrayList<Integer> list=new ArrayList<>();
        while(head!=null){
            list.add(head.val);
            head=head.next;
        }
        int i=0;
        int j=list.size()-1;
        while(i<j){
            if(!list.get(i).equals(list.get(j))){
                return  false;
            }
            i++;
            j--;
        }
        return  true;
    }
    /*-----------------2. 递归---------------------*/
    private static ListNode frontPointer;
    public static  boolean isPalindrome2(ListNode head) {
        frontPointer=head;
        return recursivelyCheck(head);
    }

    private static boolean recursivelyCheck(ListNode head) {
        if(head!=null){
            if(!recursivelyCheck(head.next)) return false;
            if(head.val!=frontPointer.val) return false;
            frontPointer=frontPointer.next;
        }
        return true;
    }
}


