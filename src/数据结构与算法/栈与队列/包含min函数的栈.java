package 数据结构与算法.栈与队列;

import java.util.Stack;
/**
 * 复制的算法
 */
public class 包含min函数的栈 {
        Stack<Integer> s1=new Stack<Integer>();
        Stack<Integer> s2=new Stack<Integer>();

        public void push(int node) {
            s1.push(node);
            //如果s2为空或者，node小于等于s2.peek()
            if(s2.isEmpty()||s2.peek()>=node)
                //入s2栈
                s2.add(node);
            else{
                //否则 s2从自己栈顶复制一个值入本栈
                s2.add(s2.peek());
            }
        }
        //这里也可以通过判断栈顶元素是否相同
        public void pop() {
            s1.pop();
            s2.pop();
        }

        public int top() {
            return s1.peek();
        }

        public int min() {
            return s2.peek();
        }
}
