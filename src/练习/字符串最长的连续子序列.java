package 练习;

import java.util.HashMap;

public class 字符串最长的连续子序列 {
    public static void main(String[] args) {
        String s="aaaabcdefgaaaaa";
       // char[] s1=s.toCharArray();
        int arr[]=helper(s);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
    }
    public static  int []  helper(String s){
        HashMap<Character,Integer> map=new HashMap();
        int i=0;
        //int j=0;
        int max=0;
        int[] arr=new int[2];
        for(int j=0;j<s.length();j++){
            if(!map.containsKey(s.charAt(j))){
                map.put(s.charAt(j),j);
                //j++;
                if(j-i>max){
                    arr[0]=i;
                    arr[1]=j;
                    max=j-i;
                }
      //map.get(s.charAt(j))>=i必须判断它是否是在范围内，且这里是闭区间
            }else if(map.containsKey(s.charAt(j))&&map.get(s.charAt(j))>=i){

                i=map.get(s.charAt(j))+1;
                map.put(s.charAt(j),j);
            }

        }
        return arr;
    }
}
