package 数据结构与算法.其他.源码;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class hashmap {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map=new HashMap<>();
       // HashMap<Integer, Integer> map=new HashMap<>();
        int x=1;
        int y=2;
        map.put(y,x);
        System.out.println(map.get(x));
        System.out.println(map.containsKey(y));
        System.out.println(map.containsValue(x));
        map.containsKey(y);
        map.containsValue(x);
        ConcurrentHashMap <Integer, Integer> Cmap=new ConcurrentHashMap<>();
    }
}
