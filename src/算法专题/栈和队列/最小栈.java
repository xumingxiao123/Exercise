package 算法专题.栈和队列;

import java.util.Stack;

class 最小栈 {

    private  Stack<Integer> data;
    private Stack<Integer> helper;
    /** initialize your data structure here. */
    public void MinStack() {
        data=new Stack<>();
        helper=new Stack<>();
    }

    public void push(int x) {
        data.push(x);
        if(helper.isEmpty()||x<=helper.peek()){
            helper.push(x);
        }else{
            helper.push(helper.peek());
        }
    }

    public void pop() {
        if(!data.isEmpty()){
            data.pop();
            helper.pop();
        }
        throw new RuntimeException("栈中元素为空，此操作非法");

    }

    public int top() {
        if(!data.isEmpty()){
            return  data.peek();
        }
        throw new RuntimeException("栈中元素为空，此操作非法");
    }

    public int getMin() {
        if(!helper.isEmpty()){
            return helper.peek();
        }
        throw new RuntimeException("栈中元素为空，此操作非法");
    }
}