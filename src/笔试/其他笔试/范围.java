package 笔试.其他笔试;

import java.util.ArrayList;
import java.util.Scanner;

public class 范围 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int num=cin.nextInt();
        int s=cin.nextInt();
        int e=cin.nextInt();
        ArrayList<Integer> list =new ArrayList<>();
        for(int i=0;i<num;i++){
            int temp=cin.nextInt();
            if (temp>=s&&temp<=e){
                list.add(temp);
            }
        }
        if(list.size()>0){
            for (Integer n:list){
                System.out.print(n+" ");
            }
        }else{
            System.out.print("-1");
        }

    }
}
