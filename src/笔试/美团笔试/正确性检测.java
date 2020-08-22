package 笔试.美团笔试;

import java.util.ArrayList;
import java.util.Scanner;

public class 正确性检测 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String s = cin.next();
            list.add(s);
        }
        for (int j = 0; j < list.size(); j++) {
            String t = list.get(j);
            if ('A' <= t.charAt(0) && 'Z' >= t.charAt(0) || t.charAt(0) <= 'z' && t.charAt(0) >= 'a') {
                boolean num = false;
                boolean zm = false;
                for (int k = 1; k < t.length(); k++) {
                    if ('A' <= t.charAt(k) && 'Z' >= t.charAt(k) || t.charAt(k) <= 'z' && t.charAt(k) >= 'a' || t.charAt(k) <= '9' && t.charAt(k) >= '0') {
                        if ('A' <= t.charAt(k) && 'Z' >= t.charAt(k) || t.charAt(k) <= 'z' && t.charAt(k) >= 'a')
                            zm = true;
                        if (t.charAt(k) <= '9' && t.charAt(k) >= '0') num = true;
                    } else {
                        System.out.println("Wrong");
                        break;
                    }
                }
                if (num && zm) {
                    System.out.println("Accept");
                } else {
                    System.out.println("Wrong");
                }
            }else{
                    System.out.println("Wrong");
                }
            }
        }


}
