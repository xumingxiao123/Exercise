package 笔试.美团笔试2;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.HashMap;

public class 点名 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n=cin.nextInt();
        int[] nums=new int[n];

        for (int j=0;j<n;j++){
            nums[j]=cin.nextInt();
        }
        LinkedList<Integer> list= new LinkedList<>();
        LRU cache = new LRU(n);
        for (int i=0;i<n;i++){
            cache.put(nums[i],nums[i]);
        }
        ArrayList<Integer> list1 =cache.helper();
        for (Integer nn:list1){
            System.out.println(nn);
        }
    }

    static class LRU {
    //第三步 需要什么参数？
    //不能加private，不然子类访问不到
     int capacity;
    //private int size;
     HashMap<Integer,Node> map;
    //构造头尾结点，保证（在空结点情况下）的操作一致性
     Node head;
     Node tail;

    //第二步，写构造方法，传入最大容量参数
    LRU(int capacity){

        this.capacity=capacity;
        //初始化hashmap
        map=new HashMap<>();
        //构造双向链表
        head= new Node(0, 0);
        tail= new Node(0, 0);
        head.next=tail;
        tail.pre=head;
        //初始化size,也可以利用map.size(),其方法直接返回size
        //size=0;
    }



        //第一步定义数据结构
    //class应该小写！！！为什么需要static ??
     private  class Node{
        //内部有key和value
        int k;
        int v;
        //有前后指针
        Node pre;
        Node  next;
        //构造方法
        public Node(int k,int v){
            this.k=k;
            this.v=v;
        }
    }
    //第四步，写链表的三个方法
    //1 在尾部插入节点，不可能失败无返回值
    private void addToLast(Node newNode) {
         newNode.pre=tail.pre;
         newNode.next=tail;
         tail.pre.next=newNode;
         tail.pre=newNode;
    }
    //2 删除结点
    private  void removeNode(Node node){
        node.pre.next=node.next;
        node.next.pre=node.pre;
    }
    //3.删除头结点,可能没有节点,删除成功返回原来节点
    private  Node removeHead(){
        Node node=head.next;
        head.next=head.next.next;
        head.next.pre=head;
        return node;
    }
    //put方法
    public void put(int key, int value){
        //如果key不存在则插入
        Node node=map.get(key);
        if(node==null){
           Node newnode=new Node(key,value);
           //当操作链表时，别忘了操作map
           map.put(key,newnode);
           addToLast(newnode);
           if (map.size()>capacity){
               Node fristNode=removeHead();
               map.remove(fristNode.k);
           }
        }else{
            node.v=value;
            removeNode(node);
            addToLast(node);
        }
    }
    //get方法
    public  int get(int key){
        Node node=map.get(key);
        if(node!=null){
            removeNode(node);
            addToLast(node);
            return node.v;
        }else {
            return -1;
        }
    }
    public  ArrayList<Integer> helper(){
        ArrayList<Integer> list =new ArrayList<>();
        Node next=tail.pre;
        while (next!=head){
          list.add(next.v);
          next=next.pre;
      }
        return  list;
    }
  }
}
