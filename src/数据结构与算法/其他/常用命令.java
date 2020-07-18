package 数据结构与算法.其他;

import java.util.Arrays;

public class 常用命令 {
    public static void main(String[] args) {
        int[] array = {10, 3, 6, 1, 4, 5, 9};//正序排序
        Arrays.sort(array);//会检查数组个数大于286且连续性好就使用归并排序，若小于47使用插入排序，其余情况使用双轴快速排序
        System.out.println("升序排序：");
        for (int num : array) {
            System.out.println(num);
        }
    }
}
