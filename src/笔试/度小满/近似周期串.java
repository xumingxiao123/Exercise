package 笔试.度小满;

import java.util.ArrayList;
import java.util.Scanner;

public class 近似周期串 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n=cin.nextInt();
        ArrayList<String> list=new ArrayList<>();
        for(int i=0;i<n;i++){
           list.add(cin.next());
        }
        ArrayList<String> list2=new ArrayList<>();
        for(int i=0;i<n;i++){
            String s=list.get(i);
            if (s.length()>=3){
                String s1=s.substring(0,3);

                int p=-1;
                boolean f=true;
                for (int m=3;m<s.length();m=m+3){
                    int count=0;
                    for (int k=m;k<s.length()&&k<m+3;k++){
                        if (s.charAt(k)!=s1.charAt(k%3)){
                            if (p!=-1&&k%3!=p){
                                f=false;
                                break;
                            }
                            p=k%3;
                            count++;
                            if (count>=2){
                                f=false;
                                break;
                            }
                        }
                    }
                    if (!f){
                        break;
                    }
                }
                if (f){
                    list2.add("Yes");
                } else {
                    list2.add("No");
                }
            }else{
                list2.add("No");
            }

            }
        for (String l:list2){
            System.out.println(l);
        }

    }
}
