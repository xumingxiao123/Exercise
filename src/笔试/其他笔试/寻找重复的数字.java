package 笔试.其他笔试;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class 寻找重复的数字 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String s=cin.next();
        HashSet<Character> set= new HashSet<>();
        int count =0;
        for(int i=0;i<s.length();i++){
            if (set.contains(s.charAt(i))){
                count++;
            }else{
                set.add(s.charAt(i));
            }
        }
        System.out.print(count);
    }
}
