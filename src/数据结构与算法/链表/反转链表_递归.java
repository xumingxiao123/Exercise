package 数据结构与算法.链表;

public class 反转链表_递归 {
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
        ListNode next=headNode;
        System.out.print("正序打印结果:");
        while(next!=null){
            System.out.print(next.val+" ");
            next=next.next;
        }
        System.out.println("");
        System.out.print("倒序打印结果:");
        next=ReverseList(headNode);
        while(next!=null){
           System.out.print(next.val+" ");
            next=next.next;
        }
        //测试环
        //int count=0;
        // while(count<10){
        //    System.out.print(next.val+" ");
        //    next=next.next;
        //    count++;
        // }
    }
//比较简洁的
    public static ListNode reverseList(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        //ListNode next=head.next;
        ListNode newhead=reverseList(head.next);
        head.next.next=head;
        head.next=null;
        return newhead;
    }
//自己写的
    public static ListNode ReverseList(ListNode listNode){
        if(listNode.next==null){
            return listNode;
        }
        ListNode next=listNode.next;
        ListNode newhead =ReverseList(next);
        listNode.next.next=listNode;
        listNode.next=null;
        return newhead;
    }

}
