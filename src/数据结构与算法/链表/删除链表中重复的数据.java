package 数据结构与算法.链表;

public class 删除链表中重复的数据 {
    public static void main(String[] args) {
        ListNode headNode =new ListNode(1);
        ListNode node=new ListNode(2);
        ListNode node1=new ListNode(2);
        ListNode node2=new ListNode(2);
        ListNode node3=new ListNode(3);
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
        System.out.print("删除后的结果:");
        next=delete(headNode);
        while(next!=null){
            System.out.print(next.val+" ");
            next=next.next;
        }
    }
    public static ListNode delete(ListNode listNode) {
       ListNode  newhead=new ListNode(0);
       newhead.next=listNode;
       ListNode pre=newhead;
       ListNode last=listNode.next;
       while (last!=null){
           if(last.val==listNode.val){
               while(last.val==listNode.val){
                   last=last.next;
               }
               pre.next=last;
               listNode=last;
               last=last.next;
               pre=pre.next;
           }
           else{
               listNode=listNode.next;
               last=last.next;
               pre=pre.next;
           }

       }
       return newhead.next;
    }

}
