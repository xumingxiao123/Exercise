package 数据结构与算法.数组.滑动窗口;

import java.util.ArrayList;
import java.util.LinkedList;
/**
 * 给定一个数组和滑动窗口的大小，找出所有滑动窗口里数值的最大值。
 * 例如，如果输入数组{2,3,4,2,6,2,5,1}及滑动窗口的大小3，那么一共存在6个滑动窗口，他们的最大值分别为{4,4,6,6,6,5}；
 * 针对数组{2,3,4,2,6,2,5,1}的滑动窗口有以下6个： {[2,3,4],2,6,2,5,1}， {2,[3,4,2],6,2,5,1}，
 * {2,3,[4,2,6],2,5,1}， {2,3,4,[2,6,2],5,1}， {2,3,4,2,[6,2,5],1}， {2,3,4,2,6,[2,5,1]}。
 * */
public class 滑动窗口的最大值 {
    public static void main(String[] args) {
        int [] num={2,3,4,2,6,2,5,1};
        int [] num1={9,8,7,6,5,4,3,2};
        //LinkedList提供了方法支持队列的行为，并且它实现了Queue接口，因此LinkedList可以用作Queue的一种实现。
        LinkedList<Integer> q=new LinkedList<>();
        ArrayList<Integer> max=new ArrayList<>();
       ArrayList<Integer> max1=helper(num,3,q,max);
        //ArrayList<Integer> max1=maxInWindows(num1,3);
        int i=0;
        while(i<max1.size()){
            System.out.println(max1.get(i));
            i++;
        }
        for(Integer n:max){
            System.out.println(n);
        }

    }
    //
    public static ArrayList<Integer> helper(int [] num,int size,LinkedList<Integer> q,ArrayList<Integer> max){
      for(int i=0;i<num.length;i++){
          while(!q.isEmpty()&&num[q.peekLast()]<num[i]){
              q.pollLast();
          }
          q.addLast(i);
          //队头永远是滑动窗口中最大的元素
          if(i-q.peekFirst()==size){
              q.pollFirst();
          }
          if(i>=size-1){
              max.add(num[q.peekFirst()]);
          }
      }
      return max;
    }
    public static  ArrayList<Integer> maxInWindows(int [] num, int size) {
        if (num == null || num.length == 0 || size <= 0 || num.length < size) {
            return new ArrayList<Integer>();
        }
        ArrayList<Integer> result = new ArrayList<>();
        //双端队列，用来记录每个窗口的最大值下标
        LinkedList<Integer> qmax = new LinkedList<>();
        int index = 0;
        for (int i = 0; i < num.length; i++) {
            while (!qmax.isEmpty() && num[qmax.peekLast()] < num[i]) {
                qmax.pollLast();
            }
            qmax.addLast(i);
            //判断队首元素是否过期
            if (qmax.peekFirst() == i - size) {
                qmax.pollFirst();
            }
            //向result列表中加入元素
            if (i >= size - 1) {
                result.add(num[qmax.peekFirst()]);
            }
        }
        return result;
    }
}
