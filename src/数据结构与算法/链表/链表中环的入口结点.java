package 数据结构与算法.链表;

public class 链表中环的入口结点 {
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
        System.out.print("环的入口:"+EntryNodeOfLoop(headNode).val);
    }
    public static  ListNode EntryNodeOfLoop(ListNode listNode){
        //判断链表中是否有环
        ListNode low=listNode;
        ListNode fast=listNode;
        while(low!=null&&fast!=null){
            low=low.next;
            fast=fast.next.next;
            if(low==fast){
                break;
            }
        }
        //表示无环
        if(low!=fast){
            return null;
        }
        //表示有环
        else{
            low=listNode;
            while(low!=fast){
                low=low.next;
                fast=fast.next;
            }
            return low;
        }
    }
}
