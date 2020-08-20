package 数据结构与算法.java基础.多线程;


import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import static java.util.concurrent.TimeUnit.MILLISECONDS;

public class 线程并发{

    public static void main(String[] args) {
        //线程池的创建
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5,10 ,
                100 ,MILLISECONDS,new ArrayBlockingQueue<Runnable>(5));
        //提交线程池任务
        threadPoolExecutor.execute(new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("thread 1 execute work" );
            }
        }));
        //停止线程池
        threadPoolExecutor.shutdown();
    }
}