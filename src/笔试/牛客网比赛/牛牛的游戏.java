package 笔试.牛客网比赛;

import java.util.*;


public class 牛牛的游戏  {
    public static void main(String[] args) {
        System.out.print(solve("00110001"));
    }
    /**
     *
     * @param str string字符串 初始字符串
     * @return string字符串
     */
    public static String solve (String str) {
        // write code here
        Stack<Character> stack= new Stack<>();
        stack.push(str.charAt(0));
        for(int i=1;i<str.length();i++){
            if(!stack.isEmpty()){
                if(str.charAt(i)=='0'){
                    if(stack.peek()=='0'){
                        stack.pop();
                        if (!stack.isEmpty()&&stack.peek()=='1'){
                            stack.pop();
                        }else{
                            stack.push('1');
                        }
                    }else{
                        stack.push('0');
                    }
                }else{
                    if(stack.peek()=='1'){
                        stack.pop();
                    }else{
                        stack.push('1');
                    }
                }
            }else{
                stack.push(str.charAt(i));
            }
        }
        StringBuffer str1=new StringBuffer();
        StringBuffer str2=new StringBuffer();
        while(!stack.isEmpty()){
            str1.append(stack.pop());
        }
        for(int j=str1.length()-1;j>=0;j--){
            str2.append(str1.charAt(j));
        }
        return str2.toString();
    }
}