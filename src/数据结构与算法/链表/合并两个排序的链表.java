package 数据结构与算法.链表;

public class 合并两个排序的链表 {
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
        ListNode Node2=new ListNode(8);
        ListNode Node3=new ListNode(10);
        ListNode Node4=new ListNode(12);
        ListNode Node5=new ListNode(14);
        headNode1.next=Node;
        Node.next=Node1;
        Node1.next=Node2;
        Node2.next=Node3;
        Node3.next=Node4;
        Node4.next=Node5;
        next=headNode1;
        System.out.println("");
        System.out.print("正序打印链表2结果:");
        while(next!=null){
            System.out.print(next.val+" ");
            next=next.next;
        }
        System.out.println("");
        System.out.print("合并有序链表结果:");
        next= Merge1(headNode,headNode1);
        while(next!=null){
            System.out.print(next.val+" ");
            next=next.next;
        }
    }
    //归并做法
    public static ListNode Merge1(ListNode list1,ListNode list2) {
        ListNode list3 = new ListNode (-1);
        ListNode root=list3;
        while(list1!=null&&list2!=null){
            if(list2.val>list1.val)
            {
                root.next=list1;
                list1=list1.next;
            }else{
                root.next=list2;
                list2=list2.next;
            }
            root=root.next;
        }
        root.next=list1!=null?list1:list2;
        return list3.next;
    }
   //递归做法
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null) return l2;
        if(l2==null) return l1;

        if(l1.val>l2.val)
        {
            l2.next=mergeTwoLists(l1,l2.next);//这是嵌套入口，
            return l2;
        }else{
            l1.next=mergeTwoLists(l1.next,l2);
            return l1;
        }
    }

}
