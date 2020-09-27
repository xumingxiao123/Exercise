package 笔试.触宝;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

import java.util.*;

public class 小说阅读统计 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n=cin.nextInt();
        cin.nextLine();
        ArrayList<String> list=new ArrayList<>();
        for (int i=0;i<n;i++){
            String s=cin.nextLine();
            list.add(s);
        }
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i=0;i<n;i++){
            String s=list.get(i);
            String[] s1=s.split(" ");
            for (int j=1;j<s1.length-1;j=j+2){
                int a=Integer.parseInt(s1[j]);
                int b=Integer.parseInt(s1[j+1]);
//                System.out.print(s2+" ");
//                System.out.println(s3);
                if(map.containsKey(a)){
                   map.put(a,map.get(a)+b);
                }else{
                    map.put(a,b);
                }
            }
        }
        int[][] nums=new int[map.size()][2];
        int i=0;
        for (int key : map.keySet()){
           nums[i][0]=key;
            nums[i][1]=map.get(key);
            i++;
        }
        Arrays.sort(nums, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o2[1]-o1[1];
            }
        }) ;
        for (int j=0;j<nums.length;j++){
            System.out.print(nums[j][0]+" ");
            System.out.println(nums[j][1]);
        }
//
    }
}
