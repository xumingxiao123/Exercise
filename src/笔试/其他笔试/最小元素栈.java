package 笔试.其他笔试;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class 最小元素栈{
    static Stack<Integer> stack1 =new Stack<>();
    static Stack<Integer> stack2 =new Stack<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list =new ArrayList<>();
        int N = sc.nextInt();
        while(N > 0) {
            String str = sc.next();
            if(str.equals("push") ) {
                int n=sc.nextInt();
                push(n);
            }
            if(str.equals("pop")) {
                pop();
            }
            if(str.equals("getMin")) {
                list.add(getMin());
            }
            N--;
        }
        for(Integer n:list){
            System.out.println(n);
        }

    }
    public static void push(int x) {
        stack1.push(x);
        if(stack2.empty() || x <= stack2.peek()) {
            stack2.push(x);
        }

    }

    public static void pop() {
        if(stack1.peek().equals(stack2.peek())) {
            stack2.pop();
        }
        stack1.pop();
    }

    public int top() {
        return stack1.peek();
    }

    public static int getMin() {
        return stack2.peek();
    }

}