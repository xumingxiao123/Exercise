package 数据结构与算法.链表;

public class 链表中倒数第k个结点 {
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
        System.out.print("倒数第三个结点:");
        lastval(headNode,3);
    }
    public static void lastval(ListNode listNode,int k) {
        ListNode next = listNode;
        ListNode low = listNode;
        int count = 1;
        while (next.next != null) {
            if (count >= k) {
                low = low.next;
            }
            next = next.next;
            count++;
        }
        System.out.println(low.val);
    }
}
