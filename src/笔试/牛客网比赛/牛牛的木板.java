package 笔试.牛客网比赛;
/**
 *链接：https://ac.nowcoder.com/acm/problem/204370
 * 来源：牛客网
 *
 * 题意：
 * 牛牛从牛毕那里拿了一根长度为n的白木板，木板被等分成了n段（没有被切割，只是虚拟划分成了n段），其中有些段被牛毕用颜料染成了黑色。
 * 牛牛非常不喜欢黑色，它找来了一桶清洗剂决定对木板进行清洗，但是牛牛发现自己的清洗剂最多只能清洗m段。
 * 清洗完后，牛牛会把木板锯成纯色的几段。例如假设木板是 （黑黑黑白白白白黑黑黑 ），就会被锯成（黑黑黑）（白白白白）（黑黑黑）三段。
 * 牛牛想知道，它足够聪明地清洗木板，能获得的纯白色木板的最大长度是多少。
 */
public class 牛牛的木板 {
    public static void main(String[] args) {
        int[] nums={1,0,0,1,1,1};
        System.out.print(solve (6,1, nums));
    }
    private static  int solve (int n, int m, int[] a) {
        int max=0;
        int k=0;
        for (int j = 0, i = 0; j < n; j++) {
            //滑动窗口i,j在一次循环内应该是并行的关系
            //j每次后移一格
            if(a[j]==0) k++;
            //如果不满足条件，则让i移动到第一个不是0的位置
             while(m<k){
                if(a[i]==0) k--;
                i++;
             }
            max=Math.max(max,j-i+1);
        }
        return max;
    }
}
