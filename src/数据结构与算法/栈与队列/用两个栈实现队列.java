package 数据结构与算法.栈与队列;

import java.util.Stack;

public class 用两个栈实现队列 {
        /**
         * push操作就直接往stack1中push，
         * pop操作需要分类一下：
         * 如果stack2为空，那么需要将stack1中的数据转移到stack2中，然后在对stack2进行pop，
         * 如果stack2不为空，直接pop就ok。
         */

        Stack<Integer> stack1=new Stack<>();
        Stack<Integer> stack2=new Stack<>();
        public void  push(int node){
            stack1.push(node);
        }
        public int pop(){
            if(stack2.isEmpty()){
                while(stack1.isEmpty()){
                   stack2.push(stack1.pop());
                }
            }
            return stack2.pop();
        }

}
