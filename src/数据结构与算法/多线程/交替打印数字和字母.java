package 数据结构与算法.多线程;
class TestCollection {

    public static void main(String[] args) {
        TestCollection test = new TestCollection();
        test.t1();
        test.t2();
    }
   //定义一个静态object类型的变量；
    public static Object obj = new Object();

    public void t1() {
        new Thread(()-> {
                synchronized (obj) {
                    try {
                        for (int i = 0; i < 26; i++) {
                            System.out.print(i);
                            obj.notifyAll();
                            obj.wait();
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
        }).start();
    }

    public void t2() {
        new Thread(()-> {
                // TODO Auto-generated method stub
                synchronized (obj) {
                    try {
                        char a = 'A';
                        for (int i = 0; i < 26; i++) {
                            System.out.println((char) (a + i));
                            obj.notifyAll();
                            obj.wait();
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
        }).start();
    }
}
