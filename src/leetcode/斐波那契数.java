package leetcode;

import java.util.HashMap;

public class 斐波那契数 {
    public static void main(String[] args) {
        int N=16;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(1,1);
        map.put(2,1);
        System.out.println(helper(N,map));
    }
    public static int helper(int N,HashMap<Integer,Integer> map){
        //if(N==1||N==2){
        //    return 1;
       // }
        if(map.containsKey(N)){
            return map.get(N);
        }
        int S= helper(N-1,map)+helper(N-2,map);
        if(!map.containsKey(N)){
            map.put(N,S);
        }
        return  S;
    }
}
