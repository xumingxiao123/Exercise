package 数据结构与算法.链表;

public class 两个链表的第一个公共结点 {
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
            find(headNode,headNode1);
            //System.out.print("公共节点的值为:"+next.val);
            //next= find(headNode,headNode1);
            //while(next!=null){
            //    System.out.print(next.val+" ");
             //   next=next.next;
           // }
        }
        //归并做法
       public static void find(ListNode list1,ListNode list2) {
       int count1=0;
       int count2=0;
       ListNode list1Head=list1;
       ListNode list2Head=list2;
       while(list1!=null){
               list1=list1.next;
               count1++;
           }
       while(list2!=null){
               list2=list2.next;
               count2++;
           }
       if(count1-count2>0){
           int sub=count1-count2;
           while(sub>0){
               list1Head=list1Head.next;
               sub--;
           }
       }else{
           int sub=count2-count1;
           while(sub>0){
               list2Head=list2Head.next;
               sub--;
           }
       }

       while(list1Head!=null&&list2Head!=null){
           if(list1Head==list2Head){
               //return list1Head;
               System.out.print("公共节点的值为:"+list1Head.val);
               return;
           }
           list1Head=list1Head.next;
           list2Head=list2Head.next;
       }
       }

}
