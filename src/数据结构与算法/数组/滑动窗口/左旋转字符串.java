package 数据结构与算法.数组.滑动窗口;

/**
 * 汇编语言中有一种移位指令叫做循环左移（ROL），
 * 现在有个简单的任务，就是用字符串模拟这个指令的运算结果。
 * 对于一个给定的字符序列S，请你把其循环左移K位后的序列输出。
 * 例如，字符序列S=”abcXYZdef”,要求输出循环左移3位后的结果，
 * 即“XYZdefabc”。是不是很简单？OK，搞定它！
 */
public class 左旋转字符串 {
    public static void main(String[] args) {
        String s="abcXYZdef";
        String s1=helper(s,3);
        System.out.println(s1);
    }
    private  static  String helper(String s,int n){
        char[] c=s.toCharArray();
        if(n>c.length) return "";
        helper2(c,0,n-1);
        helper2(c,n,s.length()-1);
        helper2(c,0,s.length()-1);
        StringBuilder sb=new StringBuilder();
        for(char t:c)sb.append(t);
        //tostring不能转化数组
        return c.toString();
    }
    private  static void helper2(char[] chars,int m,int n){

        for(int i = m, j = n;i<j;i++,j--){
            char temp=chars[i];
            chars[i]=chars[j];
            chars[j]=temp;
        }
    }
}
