package 笔试.跟谁学;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class 途途与棒棒糖 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int a=cin.nextInt();
        int b=cin.nextInt();
        int max=0;
        ArrayList<Integer> list;
        for (int i=b;i>0;i--){
            list=new ArrayList<>();
            int count=i;
            max=i;
            list.add(count);
            for (int j=a-1;j>0;j--){
                count=(int) Math.ceil((double) count/2);
                list.add(count);
            }
            int sum=0;
            for(int ii=0;ii<list.size();ii++){
                int j=(Integer) list.get(ii);
                sum+=j;
            }
            if (count>0&&sum<=b) break;
        }
        System.out.println(max);
    }
}
