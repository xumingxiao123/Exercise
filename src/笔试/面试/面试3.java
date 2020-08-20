package 笔试.面试;
/**
 * 没做完，不会做
 */

import java.util.*;

/**
 *给定一个数组，例如 [1,1,2,2,2,3,3,3,3]这样的，
 *里面的数组不一定连续并且有序，
 *假设我输入 2，这个2表示出现次数最高的两个
 *那么你需要给我返回 2,3
 */
//https://blog.csdn.net/qq_40123329/article/details/88877322
public class 面试3 {
    public static void main(String[] args) {
        int num []={1,1,2,2,2,3,3,3,3};
        helper(num,2);
    }
    private  static void   helper(int num[], int n){
        //可以考虑使用一个双端队列
        //内部数据结构为数组，数组内有两个元素，一个是次数，一个是数字
        ArrayList<Integer> list= new ArrayList<>();

        //HashMap<Integer,Integer> map=new HashMap<>();
        int[] key=new int[num.length];
        int[] value=new int[num.length];
        key[0]=num[0];
        value[0]=1;
        int j=0;
        for(int i=1;i<num.length;i++){
            if(num[i-1]==num[i]){
                value[j]++;
            }
            value[++j]=num[i];
        }
        int[]  value1=value.clone();
        //System.arraycopy(value1,0,value,0,value1.length);
        //value1=Arrays.copyOf(value, value.length);
        Arrays.sort(value1);
        }

    }

