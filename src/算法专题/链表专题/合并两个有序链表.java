package Leetcode2.链表专题;

public class 合并两个有序链表 {
    public static void main(String[] args) {
        //创建链表
        int[] nums1={1,2,4};
        int[] nums2={1,3,4};
        ListNode head1=createListNode.helper(nums1);
        ListNode head2=createListNode.helper(nums2);
        ListNode next=head1;
        System.out.print("正序打印链表1结果:");
        while(next!=null){
            System.out.print(next.val+" ");
            next=next.next;
        }
        next=head2;
        System.out.print("正序打印链表1结果:");
        while(next!=null){
            System.out.print(next.val+" ");
            next=next.next;
        }
        ListNode head=mergeTwoLists(head1,head2);
        next=head;
        System.out.print("合并链表1，2结果:");
        while(next!=null){
            System.out.print(next.val+" ");
            next=next.next;
        }
    }
    public static  ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode newhead=new ListNode(-1);
        newhead.next=null;
        ListNode next=newhead;
        while(l1!=null&&l2!=null){

            if(l1.val<l2.val){
                next.next=l1;
                l1=l1.next;
            }else{
                ListNode next2= l2.next;
                next.next=l2;
                l2=l2.next;
            }
            next=next.next;
        }
        next.next=l1!=null?l1:l2;
        return  newhead.next;
    }
}
