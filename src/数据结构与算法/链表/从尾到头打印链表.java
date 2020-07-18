package 数据结构与算法.链表;

public class 从尾到头打印链表 {
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
        printListFromTailToHead(headNode);
    }
    public static void printListFromTailToHead(ListNode listNode){
      ListNode newhead=new ListNode(0);
      ListNode next=new ListNode(0);

        while(listNode!=null){
           //next就是listNode.next
             next=listNode.next;
            //listNode指向newhead.next
            listNode.next=newhead.next;
            newhead.next=listNode;
            listNode=next;
        }
         next=newhead.next;
        while(next!=null){
            System.out.print(next.val+" ");
            next=next.next;
        }
    }
}
