package 笔试.牛客网比赛;
/**
 * 给定一个只包含小写字母的字符串s，牛牛想将这个字符串中的所有'a'字母全部移动到字符串的末尾，
 * 而且保证其它字符的相对顺序不变。其中字符串s的长度<=1e6。
 *
 */
class 移动字母 {
    public static void main(String[] args) {
        System.out.print(change("abcavv"));
    }
    private static String change (String s) {
        // write code here
        char[] s1=s.toCharArray();
        int index=0;
        for(int i=0;i<s1.length;i++){
            if(s1[i]!='a'){
                char temp=s1[index];
                s1[index]=s1[i];
                s1[i]=temp;
                index++;
            }
        }
        String res = new String(s1);
        return res;
    }
}
