package 笔试.牛客网比赛;

public class 牛牛派对 {
    public static void main(String[] args) {
        int [] nums={10,10};
        System.out.print(solve(2,nums));
    }
    private static  int solve (int n, int[] a) {
        // write code here
        int count=0;
        while(count<n&&a[count%n]>0){
            count++;
            a[count%n]-=count;
        }
        return count%n+1;
    }
}
