package 算法专题.链表专题;

public class 删除链表的倒数第N个结点 {
    public static void main(String[] args) {
        //创建链表
        int[] nums1={1,2,3,4,5};
        ListNode head=createListNode.helper(nums1);
        ListNode next=head;
        System.out.print("正序打印链表1结果:");
        while(next!=null){
            System.out.print(next.val+" ");
            next=next.next;
        }
        next=removeNthFromEnd(head,2);
        while(next!=null){
            System.out.print(next.val+" ");
            next=next.next;
        }
    }
    /*-------------------------------------------------------------*/
    public static  ListNode removeNthFromEnd(ListNode head, int n) {
       ListNode slow= head;
       ListNode fast= head;
       while(n>0){
           fast=fast.next;
           n--;
       }
       fast=fast.next;
       while(fast!=null){
           slow=slow.next;
           fast=fast.next;
       }
       ListNode next=slow.next;
       slow.next=next.next;
       return head;
    }

}
