package 笔试.赛氪网;

import java.util.ArrayList;
import java.util.Scanner;
public class 点名 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int m = cin.nextInt();

        int[] nums=new int[n];
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            nums[i]=cin.nextInt();
        }
        int[] nums2=new int[m];
        for(int i=0;i<m;i++){
            nums2[i]=cin.nextInt();
        }
        list.add(nums[0]);
        int i=1;
        int j=0;
        while(i<n){
            while (j<m&&i==nums2[j]) {
                System.out.println(list.get(j));
                j++;
            }
            if(nums[i]<list.get(i-1)){
                int t=i;
                while(0<t){
                    if(list.get(t-1)<nums[i]){
                        break;
                    }
                    t--;
                }
                if(t<0) t=0;
                list.add(t,nums[i]);
            }else{
                list.add(nums[i]);
            }
            i++;
        }
    }
}
