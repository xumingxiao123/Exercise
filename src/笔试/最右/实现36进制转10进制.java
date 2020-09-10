package 笔试.最右;

import jdk.internal.org.objectweb.asm.tree.analysis.Value;

import java.util.HashMap;
import java.util.Scanner;

public class 实现36进制转10进制 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String s=cin.next();
        //String s1=helper(s);
        int len=s.length();
        if (s.charAt(0)=='-'){
            System.out.print("-"+helper(s.substring(1,len)));
        }else{
            System.out.print(helper(s));
        }


    }
    private  static  final  String X36="0123456789abcdefghijklmnopqrstuvwxyz";
    private  static final HashMap<Character,Integer> thriysixToTen=createMapThritysixToTen();

    private static HashMap<Character, Integer> createMapThritysixToTen() {
        HashMap<Character,Integer> map=new HashMap<Character,Integer>();
        for (int i=0;i<X36.length();i++){
            map.put(X36.charAt(i),i);
        }
        return map;
    }

    public  static long  helper(String s){
        if (s.equals("")) return 0;
        long  de=0;
        int power=s.length()-1;
        char[] keys=s.toCharArray();
        for (int i=0;i<s.length();i++){
            int value=0;
            if (thriysixToTen.containsKey(keys[i])){
                value=thriysixToTen.get(keys[i]);
            }else{
                return 0;
            }
            de=(long)(de+value*Math.pow(36,power));
            power--;
        }
        return de;
    }
}
