package 数据结构与算法.链表;

import java.util.*;

/*
 * public class ListNode {
 *   int val;
 *   ListNode next = null;
 * }
 */

class Solution {
    /**
     *
     * @param lists ListNode类一维数组
     * @return ListNode类
     */
    public ListNode mergeKLists (ListNode[] lists) {
        // write code here
        ListNode head =new ListNode(0);
        for(int i=1;i<lists.length;i++){
            if(i==1){
                head=Merge(lists[0],lists[i]);
            }
            head=Merge(head,lists[i]);
        }
        return head;
    }
    public static ListNode Merge(ListNode list1,ListNode list2) {
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
}