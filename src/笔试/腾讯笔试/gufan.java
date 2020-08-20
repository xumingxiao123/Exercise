package 笔试.腾讯笔试;
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
* */
public class gufan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<Integer>();
        int n = sc.nextInt();
        int m = sc.nextInt();
        String s;
        int ans;
        for(int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                s = sc.next();
                if (s.equals("PUSH")) {
                    ans = sc.nextInt();
                    queue.add(ans);
                } else if (s.equals("TOP")) {
                    System.out.println(queue.peek ());
                } else if (s.equals("POP")){
                    queue.poll ();
                } else if (s.equals("SIZE")){
                    System.out.println(queue.size());
                } else{
                    queue.clear();
            }
        }
    }
}
}
