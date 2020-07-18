package 数据结构与算法.其他;

import java.util.Arrays;

public class 数组的四种拷贝方式 {
    public static void main(String[] args) {
        for_copy();
        clone_copy();
        arraycopy_copy();
        ArrayscopyOf_copy();


    }

    /**
     * for循环拷贝数组
     */
    public static void for_copy() {
        //一维数组的拷贝
        int[] array1={1,2,3,4,5,6,7};
        int[] array2=new int[array1.length];

        for(int i = 0;i < array1.length;i++){
            array2[i] = array1[i];
        }
        //array1[]=7;
        System.out.println(Arrays.toString(array1));

        //二维数组的拷贝
        int[][] array3= {{1,2,3},{4,5,6}};
        int[][] array4 = new int[2][3];

        for(int i = 0;i < array3.length;i++){
            for(int j = 0;j < array3[i].length;j++){
                array4[i][j] = array3[i][j];
            }
        }
        System.out.println(Arrays.deepToString(array4));
    }




    /**
     * clone拷贝数组
     */
    public static void clone_copy() {
        //一维数组的拷贝
        int[] array1={1,2,3,5,9,8,7};
        int[] array2=new int[array1.length];
        array2=array1.clone();
        System.out.println(Arrays.toString(array2));


        //二维数组的拷贝
        int[][] array3={{1,2,3,4},{5,6,7}};
        int[][] array4=new int[2][];

        for(int i = 0;i < array3.length;i++){
            array4[i] = array3[i].clone();
        }
        for(int i=0;i<array3.length;i++){
            System.out.println(Arrays.toString(array4[i]));
        }

    }

    /**
     * System.arraycopy拷贝数组
     */
    public static void arraycopy_copy() {
        //一维数组的拷贝
        int[] array = {1,2,3,4,5};
        int[] array2 = new int[array.length];
        System.arraycopy(array, 0, array2, 0, array.length);//(被复制的数组，从几号下标开始复制，复制到哪个数组，复制到新数组第几号下标，复制长度)
        System.out.println(Arrays.toString(array2));

        //二维数组的拷贝
        int[][] array1={{1,2,3,5,9},{2,3,36,5,7}};
        int[][] array3=new int[2][5];
        for(int i=0;i<array1.length;i++){
            System.arraycopy(array1[i], 0, array3[i], 0, array1[i].length);
        }
        System.out.println(Arrays.deepToString(array3));


    }

    /**
     * Arrays.copyOf拷贝数组
     */
    public static void ArrayscopyOf_copy() {
        //一维数组的拷贝
        int[] array=new int[4];
        System.out.println(Arrays.toString(array));
        int[] array1 = new int[4];
        array1 = Arrays.copyOf(array,array.length);//将数组array拷贝到数组brr,拷贝长度为array.length
        System.out.println(Arrays.toString(array1));

        //一维数组的拷贝
        int[][] array2={{1,2,3,4},{2,6,7,5}};
        int[][] array3=new int[2][4];
        array3=Arrays.copyOf(array2, array2.length);
        System.out.println(Arrays.deepToString(array3));
    }

}
