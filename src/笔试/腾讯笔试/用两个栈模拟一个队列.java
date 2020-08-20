package 笔试.腾讯笔试;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
/*
6
add 1
add 2
add 3
peek
poll
peek
* */
public class 用两个栈模拟一个队列 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<Integer>();
        int n = sc.nextInt();
        //System.out.println(n);
        String s;
        int ans;
        //System.out.println(s);
        for(int i = 0; i < n; i++){
                s = sc.next();
                //System.out.println(s);
                if(s.equals("add")){
                    ans=sc.nextInt();
                   //System.out.println(ans);
                    queue.add(ans);
                    //System.out.println(queue.peek());
                }else if(s.equals("peek")){
                    System.out.println(queue.peek());
                }else{
                 queue.poll();
                }
            //sc.nextLine();
        }
    }
}


