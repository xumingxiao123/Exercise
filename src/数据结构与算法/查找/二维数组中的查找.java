package 数据结构与算法.查找;
/**
 * 在一个二维数组中（每个一维数组的长度相同），
 * 每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
 * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 * */
public class 二维数组中的查找 {
    public static void main(String[] args) {
        int arr[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int i=0,j=arr[0].length-1;
        int temp=17;
        while(i<arr.length&&j>=0){
            if(arr[i][j]==temp){
                System.out.println("ture");
                break;
            }else if(arr[i][j]>temp) {
                j--;
            }else {
                i++;
            }
        }
    }
}
