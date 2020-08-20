package 数据结构与算法.多线程;

class PrintNumberIncrInSynchronized {

    private static int number;
    private static final Object object = new Object();

    public static void main(String[] args) {

        new Thread(() -> {
            while (number < 100) {
                synchronized (object) {
                    //相对%2判断奇偶数，&效率更高
                    if ((number & 1) == 0) {
                        System.out.println(Thread.currentThread().getName() + "：" + number++);
                    }
                }
            }
        },"偶数").start();

        new Thread(() -> {
            while (number < 100) {
                synchronized (object) {
                    if ((number & 1) == 1) {
                        System.out.println(Thread.currentThread().getName() + "：" + number++);
                    }
                }
            }
        },"奇数").start();

    }

}