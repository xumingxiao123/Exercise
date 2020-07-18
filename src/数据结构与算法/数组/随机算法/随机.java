package 数据结构与算法.数组.随机算法;

import java.util.Random;
/*
方法1
(数据类型)(最小值+Math.random()*(最大值-最小值+1))
例:(int)(1+Math.random()*(10-1+1))
从1到10的int型随数
方法2
获得随机数
for (int i=0;i<30;i++)
{System.out.println((int)(1+Math.random()*10));}
(int)(1+Math.random()*10)
通过java.Math包的random方法得到1-10的int随机数
公式是:最小值---最大值（整数）的随机数
（类型）最小值+Math.random()*最大值
方法3
Random ra =new Random();
for (int i=0;i<30;i++)
{System.out.println(ra.nextInt(10)+1);}
通过java.util包中的Random类的nextInt方法来得到1-10的int随机数
* */
public class 随机 {
    public static void main(String[] args) {
        Random rand = new Random();
    }
}
