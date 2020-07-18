package 数据结构与算法.其他.赛码网;
/*
判断字符串b的所有字符是否都在字符串a中出现过，a、b都是可能包含汉字的字符串。b中重复出现的汉字，那么a中也要至少重复相同的次数。汉字使用gbk编码（简单的说，用两个字节表示一个汉字，高字节最高位为1的代表汉字，低字节最高位可以不为1）。
int is_include(char *a, char *b);
返回0表示没有都出现过，返回1表示都出现过。
请设计一个算法。
输入
字符串a\n字符串b
样例输入
aaaabbbcccdddss
abc
输出
0或者1
样例输出
1
* */
import java.util.*;
import java.io.IOException;
public class 字符判断
{
    public static void main(String[] args) throws IOException
    {

        HashMap<Integer,Integer> map1= new HashMap<Integer,Integer>(),map2= new HashMap<Integer,Integer>();
        int c;
        while((c=System.in.read())!='\n')
            map1.put(c,map1.getOrDefault(c,0)+1);
        while((c=System.in.read())!='\n')
            map2.put(c,map2.getOrDefault(c,0)+1);
        int flag =1;
        for(Integer s : map2.keySet())
            if(map1.get(s)==null || map1.get(s) < map2.get(s))
            {
                flag = 0;break;
            }
        System.out.println(flag);
    }
}