import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        char[] chars={'h','e','l','l','o'};
        reverseString(chars);
        System.out.print(Arrays.toString(chars));
    }
    public static void reverseString(char[] s){
        int i=0;
        int j=s.length-1;
        while (i<j){
            char temp=s[i];
            s[i]=s[j];
            s[j]=temp;
            i++;
            j--;
        }
    }
}
