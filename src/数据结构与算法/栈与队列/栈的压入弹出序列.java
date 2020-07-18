package 数据结构与算法.栈与队列;

import java.util.Stack;

public class 栈的压入弹出序列 {
    public static void main(String[] args) {
        int pushA[] = {1, 2, 3, 4, 5};
        int popB[] = {5, 4, 3, 2, 1};
        //int popB []={4,5,3,2,1};

        Stack<Integer> stack = new Stack<>();
        //stack.push(pushA[0]);

        for (int i = 0, j = 0; i < pushA.length; i++) {
            stack.push(pushA[i]);
                while (!stack.isEmpty() && j < popB.length&&stack.peek() == popB[j]) {
                    stack.pop();
                    j++;
                }
            }
        if (stack.isEmpty()) {
            System.out.println("true");
        }

    }
}
