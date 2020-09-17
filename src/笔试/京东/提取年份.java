package 笔试.京东;

import java.util.*;

public class 提取年份 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String s=cin.nextLine();
        //ArrayList<Integer> list=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i=0;i<s.length();i++){
            if (((i-1>=0&&(s.charAt(i-1)-'0'<0||s.charAt(i-1)-'0'>9))||i-1<0)
                    &&s.charAt(i)-'0'>=0&&s.charAt(i)-'0'<=3
                    &&i+1<s.length()&&s.charAt(i+1)-'0'>=0&&s.charAt(i+1)-'0'<=9
                    &&i+2<s.length()&&s.charAt(i+2)-'0'>=0&&s.charAt(i+2)-'0'<=9
                    &&i+3<s.length()&&s.charAt(i+3)-'0'>=0&&s.charAt(i+3)-'0'<=9
                &&((i+4<s.length()&&(s.charAt(i+4)-'0'<0||s.charAt(i+4)-'0'>9)||i+4>=s.length())))
            {

//                if (i+4<s.length()){
                    int t=Integer.parseInt(s.substring(i,i+4),10);
                    if (t>=1000&&t<=3999){
                        if (map.containsKey(t)){
                            map.put(t,map.get(t)+1);
                        }else{
                            map.put(t,1);
                        }
//                    }
                }

            }
        }
        int[][] nums=new int[map.size()][2];
        int i=0;
        for (int key: map.keySet()){
            nums[i][0]=key;
            nums[i][1]=map.get(key);
            i++;
        }
        Arrays.sort(nums, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0];
//                if(o1[1]!=o2[1]){
//
//                }else{
//                    return o2[0]-o1[0];
//                }
            }
        });
        for (int j=0;j<nums.length;j++){
            //System.out.print(nums[j][0]+" "+ nums[j][1]+" ");
            System.out.print(nums[j][0]+" ");
        }

//        for (int n:list){
//            System.out.print(n+" ");
//        }
    }
}
