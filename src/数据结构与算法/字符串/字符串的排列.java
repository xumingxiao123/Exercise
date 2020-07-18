package 数据结构与算法.字符串;

import java.util.*;

/**
 * 输入一个字符串,按字典序打印出该字符串中字符的所有排列。
 * 例如输入字符串abc,则打印出由字符a,b,c所能排列出来的所有字符串abc,acb,bac,bca,cab和cba。
 * */
public class 字符串的排列 {
    public static void main(String[] args) {
        String str="abc";
        //ArrayList<String> list=new ArrayList<>();
        HashSet<String> charset=new HashSet<>();
        if(str!=null&&str.length()>0){
            helper(str.toCharArray(),charset,0);
            //Collections.sort(charset);
        }

        Iterator<String> iterator = charset.iterator();//遍历器
        while(iterator.hasNext())System.out.print(iterator.next()+" ");//判断是否有，有就输出
    }
    private static void helper (char []chars,HashSet<String> charset, int i){
      //递归的出口，就是只剩一个字符的时候，递归的循环过程，就是从每个子串的第二个字符开始依次与第一个字符交换，然后继续处理子串。
        if(i==chars.length-1){
          charset.add(String.valueOf(chars));
      }else{
            for(int j=i;j<chars.length;j++){
                    swap(chars,i,j);
                    helper(chars,charset,i+1);
                    swap(chars,j,i);
                }
            }
        }

    private static void  swap(char[] cs,int i,int j){
        char temp=cs[i];
        cs[i]=cs[j];
        cs[j]=temp;
    }
}
