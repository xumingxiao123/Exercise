package 数据结构与算法.排序;

/**
 * @author: gethin
 * @create: 2018-05-23 16:21
 * @description: 常用排序算法
 **/
public class 堆排序 {

    public static void headSort(int[] list) {
        //构造初始堆,从第一个非叶子节点开始调整,左右孩子节点中较大的交换到父节点中
        for (int i = (list.length) / 2 - 1; i >= 0; i--) {
            headAdjust(list, list.length, i); //每一轮调整一个结点
        }

        //排序，将最大的节点放在堆尾，然后从根节点重新调整
        for (int i = list.length - 1; i >= 1; i--) {
            //以下三句换出了根结点的关键字，将其放进最终位置
            int temp = list[0];
            list[0] = list[i];
            list[i] = temp;
            headAdjust(list, i, 0);//每执行一次，一轮调整
        }
    }

    private static void headAdjust(int[] list, int len, int i) {
        int index = 2 * i + 1,temp;
        while (index < len) {
            if (index + 1 < len&&list[index] < list[index + 1]) {
                    index++;
            }
            if (list[index] > list[i]) {
                temp = list[i];
                list[i] = list[index];
                list[index] = temp;
                i = index;
                index = 2 * i + 1;
            } else {
                break;//break是跳出整个循环，continue是中止此次循环
            }
        }
    }
}