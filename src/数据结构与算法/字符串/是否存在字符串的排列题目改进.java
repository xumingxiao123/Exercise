package 数据结构与算法.字符串;

public class 是否存在字符串的排列题目改进 {
        public static void main(String[] args) {
            String str1="cda";
            String str2="abcdefg";

            System.out.println(checkInclusion(str1,str2));
        }

        public static  boolean checkInclusion (String s1,String s2) {
            if (s1.length() > s2.length()) {
                return false;
            }
            char[] chars1 = new char[26];
            char[] chars2 = new char[26];
            for (int i = 0; i < s1.length(); i++) {
                chars1[s1.charAt(i) - 'a']++;
                chars2[s2.charAt(i) - 'a']++;
            }
            int count=0;
            for(int i=0;i<26;i++){
                if(chars1[i]==chars2[i]){
                    count++;
                }
            }
            for(int i=0;i<s2.length()-s1.length();i++){
                if(count==26) {
                    return true;
                }
                chars2[s2.charAt(i)-'a']--;
                if(chars2[s2.charAt(i)-'a']==chars1[s2.charAt(i)-'a']){
                    count++;
                }else if(chars2[s2.charAt(i)-'a']+1==chars1[s2.charAt(i)-'a']){
                    count--;
                }
                chars2[s2.charAt(i+s1.length())-'a']++;
                if(chars2[s2.charAt(i+s1.length())-'a']==chars1[s2.charAt(i+s1.length())-'a']){
                    count++;
                }else if(chars2[s2.charAt(i+s1.length())-'a']-1==chars1[s2.charAt(i+s1.length())-'a']){
                    count--;
                }
            }
            return false;
        }
}
