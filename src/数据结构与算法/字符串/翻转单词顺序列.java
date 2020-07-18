package 数据结构与算法.字符串;

public class 翻转单词顺序列 {
    public static void main(String[] args) {
        String str="I am student";

        System.out.println(helper(str));
    }
    public static  String  helper (String str){
        char[] chars=str.toCharArray();
        reverse(chars,0,chars.length - 1);
        //使用双指针进行旋转
        int start=0;
        for (int i=0;i<str.length();i++){
            if(chars[i]==' '){
                reverse(chars, start,i-1);
                //记录开始位置
                start=i+1;
            }
        }
        //最后一组自己反转
        reverse(chars,start,str.length()-1);
        return new String(chars);
    }
    public  static  void reverse(char[] chars,int i,int j){
        while(i<j){
            char temp=chars[i];
            chars[i]=chars[j];
            chars[j]=temp;
            i++;
            j--;
        }
    }
}
