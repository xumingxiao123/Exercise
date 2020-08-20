package 算法专题.链表专题;

public class 翻转链表 {
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
        head=reverseList2(head);
        next=head;
        System.out.print("倒序打印链表1结果:");
        while(next!=null){
            System.out.print(next.val+" ");
            next=next.next;
        }
    }
    /*------------------------头插法---------------------*/
    public static ListNode reverseList(ListNode head) {
        ListNode newhead=new ListNode(-1);
        newhead.next=null;
        while(head!=null){
            //标记
            ListNode next=head.next;
            //头插法
            head.next=newhead.next;
            newhead.next=head;
            //后退
            head=next;
        }
        return newhead.next;
    }
    /*------------------------递归---------------------*/
    public static ListNode reverseList2(ListNode head) {
        //假设链表没有结点或者只有1个节点
        if(head==null||head.next==null){
            return head;
        }
        //假设链表有2个以上结点
        ListNode newhead=reverseList2(head.next);
        //利用head翻转
        head.next.next=head;
        head.next=null;
        //newhead不能动
        return newhead;
    }
}
