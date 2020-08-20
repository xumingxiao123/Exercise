package 算法专题.链表专题;

public class 相交链表 {
    public static void main(String[] args) {
            //创建有序链表1
            ListNode headNode =new ListNode(1);
            ListNode node=new ListNode(3);
            ListNode node1=new ListNode(5);
            ListNode node2=new ListNode(7);
            ListNode node3=new ListNode(9);
            ListNode node4=new ListNode(11);
            ListNode node5=new ListNode(13);
            headNode.next=node;
            node.next=node1;
            node1.next=node2;
            node2.next=node3;
            node3.next=node4;
            node4.next=node5;
            ListNode next=headNode;
            System.out.print("正序打印链表1结果:");
            while(next!=null){
                System.out.print(next.val+" ");
                next=next.next;
            }
            //创建有序链表2
            ListNode headNode1 =new ListNode(2);
            ListNode Node=new ListNode(4);
            ListNode Node1=new ListNode(6);
           // ListNode Node2=new ListNode(8);
            //ListNode Node3=new ListNode(10);
            //ListNode Node4=new ListNode(12);
            //ListNode Node5=new ListNode(14);
            headNode1.next=Node;
            Node.next=Node1;
            Node1.next=node3;
            node3.next=node4;
            node4.next=node5;
            next=headNode1;
            System.out.println("");
            System.out.print("正序打印链表2结果:");
            while(next!=null){
                System.out.print(next.val+" ");
                next=next.next;
            }
            System.out.println("");
            System.out.print(getIntersectionNode(headNode,headNode1).val);
    }
    public  static  ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        //这是高手！！！！
        ListNode pA = headA, pB = headB;
        while (pA != pB) {
            //思想就是当一个链表到达null时，就从另一条链表的开头走
            pA = pA == null ? headB : pA.next;
            pB = pB == null ? headA : pB.next;
        }
        return pA;
    }
}
