package 笔试.科大讯飞;

import java.util.Scanner;

public class 下滑线 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String s=cin.next();
        //System.out.print(s);
        StringBuffer s1=new StringBuffer();
        int count=0;
        if(s.charAt(0)!='_'){
                s1.append(s.charAt(0));
                count++;
        }else{
            if (s.length()>1&&s.charAt(1)!='_'){
                s1.append(s.charAt(0));
                count++;
           }
        }
        int i;
        for (i=1;i<s.length()-1;i++){
            if(s.charAt(i)!='_'){
                s1.append(s.charAt(i));
                count++;
            }else{
                if (s.charAt(i-1)!='_'&&s.charAt(i+1)!='_'){
                 s1.append(s.charAt(i));
                 count++;
                }
                else if (s.charAt(count)!='_'){
                    s1.append(s.charAt(i));
                    count++;
                }
          }
        }
        if(s.length()>1){
            if(s.charAt(i)!='_'){
                s1.append(s.charAt(i));
                count++;
            }else{
                if (s.charAt(i-1)!='_'){
                    s1.append(s.charAt(i));
                    count++;
                }
            }
        }

        System.out.print(s1);
    }

}

