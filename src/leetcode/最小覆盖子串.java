package leetcode;

import com.sun.org.apache.bcel.internal.generic.RETURN;

//给你一个字符串 S、一个字符串 T，请在字符串 S 里面找出：包含 T 所有字符的最小子串。
//输入: S = "ADOBECODEBANC", T = "ABC"
//输出: "BANC"
public class 最小覆盖子串 {
    //使用滑动窗口
    public static void main(String[] args) {
        //String S="ADOBECODEBANC";
        //String T="ABC";
        String S="a";
        String T="a";
        //System.out.println('z'-'A');
        if(S==T){
            System.out.println(S);
        }
        int [] arr=new int['z'-'A'];
        for(int i=0;i<T.length();i++){
            arr[T.charAt(i)-'A']++;
        }
        int [] nums=arr.clone();
        int sum=T.length();
        int count=0;
        int j=0,i=0;
        int[] arrs={-1,-1};
        while(i<S.length()-sum){
            int right=0;
            int left=0;
            while(i<S.length()&&arr[S.charAt(i)-'A']==0){
                i++;
            }
            arr[S.charAt(i)-'A']--;
            count++;
            //if(count==sum)
           // System.out.print(i+" ");
            left=i;


            for(j=i+1;j<S.length();j++){
                if(arr[S.charAt(j)-'A']>0){
                    arr[S.charAt(j)-'A']--;
                    count++;
                    if(count==sum){
                       // System.out.print(j);
                        right=j;
                        break;
                    }
                }
            }
            arr=nums.clone();
            i++;
            count=0;
            //System.out.println("");
            //int temp=right-left;
            int min=S.length()+1;
            if(right-left>=sum&&min>right-left){
                min=right-left;
                arrs[0]=left;
                arrs[1]=right;
            }
        }
        if(arrs[0]!=-1&&arrs[1]!=-1){
           // return S.substring(arrs[0],arrs[1]);
            System.out.println(S.substring(arrs[0],arrs[1]+1));
        }

        //    return ;

//        while(j<T.length()&&arr[T.charAt(i)-'A']>0){
//            arr[T.charAt(j)-'A']--;
//            count++;
//            if(count==sum) return;
//            j++;
//        }

    }
}
