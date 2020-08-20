import java.util.HashMap;
import java.util.Scanner;

public class 字符串的排列 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String a=cin.nextLine();
        String b=cin.nextLine();
        HashMap<Character,Integer> map= new HashMap<>();
        for(int i=0;i<a.length();i++){
            if (map.containsKey(a.charAt(i))){
                map.put(a.charAt(i),map.get(a.charAt(i))+1);
            }else{
                map.put(a.charAt(i),1);
            }
        }
       // int count=b.length();
        boolean x=true;
        for(int j=0;j<b.length();j++){
            if(map.containsKey(b.charAt(j))&&map.get(b.charAt(j))!=0){
                map.put(b.charAt(j),map.get(a.charAt(j))-1);
                //count--;
            }else{
                x=false;
                break;
            }
        }
        if (x){
            System.out.print("True");
        }else{
            System.out.print("False");
        }
    }
}
