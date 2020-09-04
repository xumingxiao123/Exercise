package 笔试.VIPKID;

import com.sun.scenario.effect.Merge;

import java.lang.reflect.Array;
import java.util.*;

public class 合并重叠区间 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        ArrayList<Integer> list= new ArrayList<>();
        while(cin.hasNextInt()){
            int N = cin.nextInt();
            //System.out.println(N);
            list.add(N);
         }
//        while(cin.hasNext()){
//
//            //int M = cin.nextInt();
//            //
//        }
//        for (Integer s:list){
//            System.out.println(s);
//        }
        int[][] nums= new int[list.size()/2][2];
        int count=0;
        for(int i=0;i<list.size()/2;i++){
            nums[i][0]=list.get(count);
            count++;
            nums[i][1]=list.get(count);
            count++;
        }
        int[][] arrs=merge(nums);
        for(int i=0;i<arrs.length;i++){
            System.out.println(arrs[i][0]+" "+arrs[i][1]);
        }
    }
    public static int[][] merge(int[][] intervals) {
        int len = intervals.length;
        if (len < 2) {
            return intervals;
        }

        // 按照起点排序
        Arrays.sort(intervals, Comparator.comparingInt(o -> o[0]));

        // 也可以使用 Stack，因为我们只关心结果集的最后一个区间
        List<int[]> res = new ArrayList<>();
        res.add(intervals[0]);

        for (int i = 1; i < len; i++) {
            int[] curInterval = intervals[i];

            // 每次新遍历到的列表与当前结果集中的最后一个区间的末尾端点进行比较
            int[] peek = res.get(res.size() - 1);

            if (curInterval[0] > peek[1]) {
                res.add(curInterval);
            } else {
                // 注意，这里应该取最大
                peek[1] = Math.max(curInterval[1], peek[1]);
            }
        }
        return res.toArray(new int[res.size()][]);
    }


//    public  static  int[][] merge(int[][] intervals) {
//        // 先按照区间起始位置排序
//        Arrays.sort(intervals, (v1, v2) -> v1[0] - v2[0]);
//        // 遍历区间
//        int[][] res = new int[intervals.length][2];
//        int idx = -1;
//        for (int[] interval: intervals) {
//            // 如果结果数组是空的，或者当前区间的起始位置 > 结果数组中最后区间的终止位置，
//            // 则不合并，直接将当前区间加入结果数组。
//            if (idx == -1 || interval[0] > res[idx][1]) {
//                res[++idx] = interval;
//            } else {
//                // 反之将当前区间合并至结果数组的最后区间
//                res[idx][1] = Math.max(res[idx][1], interval[1]);
//            }
//        }
//        return Arrays.copyOf(res, idx + 1);
//    }

}
