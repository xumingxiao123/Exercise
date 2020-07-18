package 数据结构与算法.面试;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * # 区间合并
 * # 给定一些数组，例如下面的格式，他们都表示一个区间，然后你需要将区间进行合并
 * [1,2],[2,4],[3,7],[8,11]
 * # 如上所示， [1,2] 和 [2,4] = [1,4]
 * # 然后 [1,4] 和 [3,7] = [1,7]
 * # 最后 [1,7] 和 [8,11] 无法合并，所以最后结果应该返回 [1,7],[8,11]
 */
public class 面试1 {
    public static void main(String[] args) {
        int [][] num1={{1,2},{2,4},{3,7},{8,11}};
        int [][] num=merge(num1);
        for(int i=0;i<num.length;i++){
            //for(int j=0;j<num[0].length;j++){
                System.out.print(num[i][0]+" ");
                //j++;
                System.out.println(num[i][1]);
            //}
        }
    }
    public static  int[][] merge(int[][] intervals) {
        List<int[]> res = new ArrayList<>();
        if (intervals.length == 0 || intervals == null) return res.toArray(new int[0][]);
        // 对起点终点进行排序
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        int i = 0;
        while (i < intervals.length) {
            int left = intervals[i][0];
            int right = intervals[i][1];
            // 如果有重叠，循环判断哪个起点满足条件
            while (i < intervals.length - 1 && intervals[i + 1][0] <= right) {
                i++;
                right = Math.max(right, intervals[i][1]);
            }
            // 将现在的区间放进res里面
            res.add(new int[]{left, right});
            // 接着判断下一个区间
            i++;
        }
        return res.toArray(new int[0][]);
    }

}
