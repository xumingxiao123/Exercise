package 笔试.面试;

import java.util.*;

/**
 *给定一个数组，例如 [1,1,2,2,2,3,3,3,3]这样的，
 *里面的数组不一定连续并且有序，
 *假设我输入 2，这个2表示出现次数最高的两个
 *那么你需要给我返回 2,3
 */
//https://blog.csdn.net/qq_40123329/article/details/88877322
public class 面试2 {
    public static void main(String[] args) {
        int num []={1,1,2,2,2,3,3,3,3};
        helper(num,2);
    }
    private  static void   helper(int num[], int n){

        ArrayList<Integer> list= new ArrayList<>();

        HashMap<Integer,Integer> map=new HashMap<>();

        map.put(num[0],1);
        for(int i=1;i<num.length;i++){

            if(map.containsKey(num[i])){
                //map找到key，对
                map.put(num[i],map.get(num[i])+1);
            }else{
                map.put(num[i],1);
            }
        }

        Collection<Integer> count = map.values();

        //找出map的value中最大的数字，也就是数组中数字出现最多的次数
        int maxCount = Collections.max(count);

        int maxNumber = 0;

        for(Map.Entry<Integer, Integer> entry : map.entrySet())
        {
            //得到value为maxCount的key，也就是数组中出现次数最多的数字
            if(maxCount == entry.getValue())
            {
                maxNumber = entry.getKey();
            }
        }

        System.out.println("出现次数最多的数字为：" + maxNumber);
        System.out.println("该数字一共出现" + maxCount + "次");
    }

}
