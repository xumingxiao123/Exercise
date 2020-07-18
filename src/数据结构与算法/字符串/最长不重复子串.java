package 数据结构与算法.字符串;

import java.util.HashMap;
//import java.util.Map;
/**
 * Created by xu on 2020/4/13.
 */
public class 最长不重复子串 {
    public static void main (String[] args){
        int temp=lengthOfLongestSubstring("sdadabcdefgasdasda");
        System.out.print(temp);

    }
        public static int lengthOfLongestSubstring(String s) {
            int n = s.length(), ans = 0;
            HashMap<Character, Integer> map = new HashMap<>(); // current index of character
            // try to extend the range [i, j]
            for (int j = 0, i = 0; j < n; j++) {
                //如果有重复字符，找出重复字符的位置（必须在[i, j)内）
                if (map.containsKey(s.charAt(j))) {
                    i = Math.max(map.get(s.charAt(j)), i);
                }
                //实时记录最长长度
                ans = Math.max(ans, j - i + 1);
                //j入数组
                map.put(s.charAt(j), j + 1);
            }
            return ans;
        }
}

