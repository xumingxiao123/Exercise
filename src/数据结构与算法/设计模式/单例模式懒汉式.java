package 设计模式;

public class 单例模式懒汉式 {
    public static void main(String[] args) {
        Singleton s1= Singleton.s();
        Singleton s2= Singleton.s();
        System.out.print(s1==s2);

    }
    //饿汉式，有需要再创建

}
//此为非线程安全的懒汉模式
class  Singleton{
    //volatile禁止重新排序，类加载的准备阶段会给静态变量赋默认值，此时已经不为空但是还没有初始化。
    //导致第二个线程使用未初始化的实例
    private volatile  static Singleton s;
    //设置类的构造为私有，防止被其他类创建
    private  Singleton(){}
    public static  Singleton s (){
        //第一层屏障，为了防止多次加锁，而造成的性能损耗
        if(s==null){
            //step2
            //加锁防止多线程
            synchronized(Singleton.class){
                //第二层屏障，为了防止已经突破了第一层屏障位于step2位置的线程,重现创建对象
                if(s==null){
                    s=new Singleton();
                }
            }
        }
        return s;
    }
}
