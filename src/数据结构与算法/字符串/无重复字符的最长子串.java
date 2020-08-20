package 数据结构与算法.字符串;

import java.util.HashMap;

/**
 *给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 * 可以用一个map存储字符及其索引，用一个滑动窗口动态存储最长子串
 */

public class 无重复字符的最长子串 {
    public static void main(String[] args) {
        String str1="abba";
        System.out.println(lengthOfLongestSubstring(str1));
    }
    public  static  int lengthOfLongestSubstring(String str){
        HashMap<Character,Integer> map=new HashMap();
        int ans=0;
        for(int i=0,j=0;j<str.length();j++){
            if(map.containsKey(str.charAt(j))){
                i=Math.max(map.get(str.charAt(j))+1,i);

            }

            map.put(str.charAt(j),j);
            //动态记录最大值
            ans=Math.max(ans,j-i+1);
        }
        return  ans;
    }
}
