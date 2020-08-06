package Leetcode2.链表专题;

public class createListNode {
    public  static ListNode helper(int [] arr){
        if(arr.length<1) return null;
        ListNode head=new ListNode(0);
        ListNode next=head;
        for(int i=0;i<arr.length;i++){
           ListNode temp=new ListNode(arr[i]);
            next.next=temp;
            next=next.next;
        }
        return head.next;
    }
}
