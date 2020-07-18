package 数据结构与算法.字符串;

/**
 * 给定两个字符串 s1 和 s2，写一个函数来判断 s2 是否包含s1的排列。
 * 换句话说，第一个字符串的排列之一是第二个字符串的子串。
 * */
public class 是否存在字符串的排列 {
    public static void main(String[] args) {
        String str1="cba";
        String str2="abcdefg";

        System.out.println(checkInclusion(str1,str2));
    }

    public static  boolean checkInclusion (String s1,String s2){
        if(s1.length()>s2.length()){
            return false;
        }
        char[] chars1 =new char[26];
        char[] chars2=new char[26];
        for(int i=0;i<s1.length();i++){
            chars1[s1.charAt(i)-'a']++;
            chars2[s2.charAt(i)-'a']++;
        }

        for (int i=0;i<s2.length()-s1.length();i++){
            if(swap(chars1,chars2)){
                return true;
            }else{
                chars2[s2.charAt(i)-'a']--;
                chars2[s2.charAt(i+s1.length())-'a']++;
            }
        }
        return  false;
    }

    public static  boolean swap(char[] chars1,char[] chars2){

        for(int i=0;i<26;i++){
            if(chars1[i]!=chars2[i]){
                return false;
            }
        }
        return true;
    }
}
