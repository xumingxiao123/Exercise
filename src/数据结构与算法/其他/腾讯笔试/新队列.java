package 数据结构与算法.其他.腾讯笔试;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
/*
2
7
PUSH 1
PUSH 2
TOP
POP
TOP
POP
POP
5
PUSH 1
PUSH 2
SIZE
POP
SIZE
**/
public class 新队列 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Queue<Integer> queue = new LinkedList<Integer>();
        //System.out.println(n);
        String s;
        int ans = 0;

        s = sc.nextLine();
        System.out.println(s);
        s = sc.nextLine();
        System.out.println(s);
        s = sc.nextLine();
        System.out.println(s);
        for(int i = 0; i < n; i++){
            s = sc.nextLine();
            System.out.println(s);
            if(s=="add"){
                ans=sc.nextInt();
                // System.out.println(ans);
                queue.add(ans);
                //System.out.println(queue.peek());
            }else if(s.equals("peek")){
                //System.out.println(queue.peek());
            }else{
                //ans=queue.remove();
            }
            s=null;
        }
    }
}
