package 数据结构与算法.数组.DFS;

public class 剪绳子_递归 {
    public static void main(String[] args) {
        int x=8;
        // number = 2 和 3 时，分 2 段和分 1 段的结果是不一样的，所以需要特判一下
        if (x == 2) {
            System.out.println(1);

        }
        else if (x == 3) {
            System.out.println(2);
        }
        else{
            System.out.println(backTrack(x));
        }
    }
    public static int backTrack(int n){
    //当n<=4时，分一段最符合条件最长
    if(n<=4){
    return n;
   }
    int max=0;
    //当n<=4时，分一段最符合条件最长
    for(int i=1;i<n;i++){
        max =Math.max(max,i*backTrack(n-i));
    }
        return max;
    }
}
