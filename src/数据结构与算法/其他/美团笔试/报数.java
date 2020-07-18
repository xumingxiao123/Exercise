package 数据结构与算法.其他.美团笔试;

import java.util.LinkedList;
import java.util.Scanner;

public class 报数 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList<Integer> list = new LinkedList<Integer>();
        int[] arr=new int[n];
        for (int i = 1; i <= n; i ++) {
            list.add(i);
        }

        int bt = 0;
        for(int i=0;i<n;i++){
            int m = sc.nextInt();
            bt = (m) % list.size();
            arr[list.get(bt)-1]=n-i;
            list.remove(bt);

        }
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}
