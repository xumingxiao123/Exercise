package leetcode;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

//s: "cbaebabacd" p: "abc"
public class 找到字符串中所有字母异位词 {
    public static void main(String[] args) {
        String s="abab";       ;
        String p="ab";
        ArrayList<Integer> list=helper1(s,p);
        for (Integer l : list) {
            System.out.print(l);
        }
    }
    //暴力
    public static ArrayList<Integer> helper(String s,String p) {
        int[] nums = new int['z' - 'a' + 1];
        for (int i = 0; i < p.length(); i++) {
            nums[p.charAt(i) - 'a']++;
        }
        int[] temp = nums.clone();
        int count;
        ArrayList<Integer> list = new ArrayList<>();
        //int i=0;
        for (int i = 0; i < s.length() - p.length() + 1; i++) {
            count = 0;
            nums = temp.clone();
            for (int j = i; j < i + p.length(); j++) {
                if (nums[s.charAt(j) - 'a'] > 0) {
                    nums[s.charAt(j) - 'a']--;
                    count++;
                }
            }
            if (count == p.length()) {
                list.add(i);
            }
        }

        return list;
    }

    public static ArrayList<Integer> helper1(String s,String p) {
        if(s.length()<p.length()){
            return null;
        }
        //链表存储符合条件的起始下标
        ArrayList<Integer> list = new ArrayList<>();
        //将两个字符串的字符频率存入字典中，其中下标代表字母，值代表频率
        int[] nums = new int['z' - 'a' + 1];
        //要保证z字母也能被记录，所以长度为'z' - 'a' + 1
        int[] nums1 = new int['z' - 'a' + 1];
        for (int i = 0; i < p.length(); i++) {
            nums[p.charAt(i) - 'a']++;
            nums1[s.charAt(i) - 'a']++;
        }
        //查看两个字符串每个字母的频率是否相同，并统计
        int count=0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==nums1[i])
             count++;
        }
        //滑动窗口大小为固定的，为i到i+p.length()-1闭区间之间。
        int i=0,j=p.length()-1;
       // for (int i = 0; i < s.length() - p.length() + 1; i++) {
        while(j+1<s.length()) {
            //int j=i+p.length();
            //如果两字符串频率相等，则添加
            if (count == 'z' - 'a' + 1) {
                list.add(i);
            }
            //i++;
            //同时向右移动
            //这里有一处细节，左边应该先移除，再移动；而右边应该先移动，在添加
            nums1[s.charAt(i) - 'a']--;
            //判断是否是因为移动而导致的匹配或不匹配
            if (nums1[s.charAt(i) - 'a'] == nums[s.charAt(i) - 'a']) {
                count++;
            } else if (nums1[s.charAt(i) - 'a'] + 1 == nums[s.charAt(i) - 'a']) {
                count--;
            }
            i++;
            j++;
            nums1[s.charAt(j) - 'a']++;
            //判断是否是因为移动而导致的匹配或不匹配
            if (nums1[s.charAt(j) - 'a'] == nums[s.charAt(j) - 'a']) {
                count++;
            } else if (nums1[s.charAt(j) - 'a'] - 1 == nums[s.charAt(j) - 'a']) {
                count--;
            }
        }
        if (count == 'z' - 'a' + 1) {
            list.add(i);
        }
        return list;
    }
}
