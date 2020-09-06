package 笔试.美团笔试2;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class 公司管理 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<String> list1=new ArrayList<>();
        while (cin.hasNextInt()){
           int  n=cin.nextInt();
            int[] nums=new int[n];
            for (int j=0;j<n;j++){
                nums[j]=cin.nextInt();
            }
            if (list1.size()%2==1){
                list1.add("NO");
            }else{
                list1.add("YES");
            }

        }
        for (String m:list1){
            System.out.println(m);
        }


    }
}
