package 数据结构与算法.数组.DFS; /**
 * Created by xu on 2020/4/7.
 */

public class 全排列数字 {
    //测试用例
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };
        fullSort(arr, 0, arr.length - 1);
    }
    //递归函数
    public static void fullSort(int[] arr, int start, int end) {
        // 递归终止条件是数组为空
        if (start == end) {
            for (int i : arr) {
                System.out.print(i);
            }
            System.out.println();
            return;
        }
        for (int i = start; i <= end; i++) {
            swap(arr, i, start);
           //Collections.swap(List<?>, int, int) 方法被用于交换在指定列表中的指定位置的元素。
            fullSort(arr, start + 1, end);
            swap(arr, i, start);
        }
    }
    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
