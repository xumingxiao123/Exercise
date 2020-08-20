package 算法专题.链表专题;

public class 检测是否有环 {
    public static void main(String[] args) {
        ListNode headNode =new ListNode(1);
        ListNode node=new ListNode(2);
        ListNode node1=new ListNode(3);
        ListNode node2=new ListNode(4);
        ListNode node3=new ListNode(5);
        ListNode node4=new ListNode(6);
        ListNode node5=new ListNode(7);
        headNode.next=node;
        node.next=node1;
        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        node4.next=node5;
        node5.next=node3;
        ListNode next=headNode;
        //System.out.print("正序打印结果:");
        //while(next!=null){
         //   System.out.print(next.val+" ");
        //    next=next.next;
        //}
        //System.out.println("");
        System.out.print("环的入口:"+detectCycle(headNode).val);
    }
    public static  ListNode detectCycle(ListNode head) {
        ListNode slow= head;
        ListNode fast=head;
        while(fast!=null){
            slow=slow.next;
            if(fast.next==null){
                return null;
            }
            fast=fast.next.next;
            if(slow==fast){
                break;
            }
        }
        if(fast==null){
            return null;
        }else {
            slow=head;
            while(slow!=fast){
                slow=slow.next;
                fast=fast.next;
            }
        }
        return slow;
    }

}
