package 数据结构与算法.字符串;
/**
 * 在一个字符串(0<=字符串长度<=10000，全部由字母组成)中找到第一个只出现一次的字符,并返回它的位置,
 * 如果没有则返回 -1（需要区分大小写）.
 *
 * 遍历一次字符串，使用一个数组来保存他们的状态
 *
 * */
public class 第一个只出现一次的字符 {

    public static void main(String[] args) {
        String str ="ssadcasdassdad";
        System.out.println(helper(str));
    }
    private  static char helper(String str){
        int  []  count =new int ['z'-'A'];

        for(int i=0;i<str.length();i++){
            count[str.charAt(i)-'A']++;
        }
        for(int i=0;i<str.length();i++){
            if(count[str.charAt(i)-'A']==1){
                return str.charAt(i);
            }
        }
        return 0;
    }
}
