import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 第n个数 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int N = cin.nextInt();

        if (N==1){
            System.out.println("2");
            return;
        }
        if (N==2) {
            System.out.println("3");
            return;
        }
        if((N==3)){
            System.out.println("5");
            return;
        }
        //int[] dp =new int[N+1];
        LinkedList<Integer> q= new LinkedList<>();
        q.add(2);
        q.add(3);
        q.add(5);
        int size=3;
        while (true){
            int temp=q.remove();
            q.add(temp*10+2);
            size++;
            if (size==N) break;
            q.add(temp*10+3);
            size++;
            if (size==N) break;
            q.add(temp*10+5);
            size++;
            if (size==N) break;
        }
        System.out.println(q.removeLast());
    }
}
