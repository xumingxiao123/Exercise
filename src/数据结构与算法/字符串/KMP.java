package 数据结构与算法.字符串;

/**
 * Created by xu on 2020/4/9.
 */
public class KMP {
    /**
     * 暴力匹配法
     */
    public static int index(String s, String t) {
        int i=0,j=0,k=0;
        while(i<s.length() && j<t.length()){
            if(s.charAt(i)==t.charAt(j)){
                i++;
                j++;
            }else{
                i=++k;
                j=0;
            }
        }
        if (j==t.length()){
            return k;
        }else{
            return 0;
        }
    }

    /**
     * 求出一个字符数组的next数组
     * @param t 字符数组
     * @return next数组
     */
    public static int[] getNextArray(String  t) {

        int[] next = new int[t.length()+1];
         int i=1,j=0;
         next[1]=0;
         while(i<t.length()){
             if(j==0||t.charAt(i)==t.charAt(j)){
                 next[i+1]=j+1;
                 i++;
                 j++;
             }else{
                 j=next[j];
             }
         }
        return next;
    }

    /**
     * 对主串s和模式串t进行KMP模式匹配
     * @param s 主串
     * @param t 模式串
     * @return 若匹配成功，返回t在s中的位置（第一个相同字符对应的位置），若匹配失败，返回-1
     */
    public static int kmpMatch(String s, String t){
        //char[] s_arr = s.toCharArray();
        //char[] t_arr = t.toCharArray();
        int[] next = getNextArray(t);
        int i = 0, j = 0;
        while (i<s.length() && j<t.length()){
            if(j == 0 || s.charAt(i)==t.charAt(j)){
                i++;
                j++;
            }
            else
                j = next[j];
        }
        if(j == t.length())
            return i-j;
        else
            return 0;
    }

    public static void main(String[] args) {
        System.out.println(index("AAAABABABBBBB", "ABABABB"));
        System.out.println(kmpMatch("AAAABABABBBBB", "ABABABB"));
    }

}