package 算法专题;

public class Solution {

    static Object object =new Object();
    static int count;

    public static void main(String[] args) {

        new Thread(()->{
            while (true){
              synchronized (object){
                  //if (count%3==0){
                  try {

                      System.out.println("线程1：a");
                      object.notify();
                      object.wait();


                  } catch (InterruptedException e) {
                      e.printStackTrace();
                  }
                  //    count++;
                  //}
              }
            }
        },"线程1").start();
        new Thread(()->{
            while (true){
                synchronized (object){
                   // if (count%3==1){

                    try {
                        System.out.println("线程2：b");
                        object.notify();
                        object.wait();

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    //    count++;
                   // }
                }
            }
        },"线程2").start();
//        new Thread(()->{
//            while (true){
//                synchronized (object){
//                    if (count%3==2){
//                        System.out.println("线程3：c");
//                        count++;
//                    }
//                }
//            }
//        },"线程3").start();
    }
}
