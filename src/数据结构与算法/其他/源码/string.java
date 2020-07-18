package 数据结构与算法.其他.源码;

public class string {
    public static void main(String[] args) {
         String s=new String("xumingxiao");

         //仅仅创建了一个数组，数组长度为16
        StringBuilder stringBuilder=new StringBuilder();
        //仅仅创建了一个数组，数组长度为16
        StringBuffer stringBuffer=new StringBuffer();
        stringBuilder.append("xumingxiao");
        stringBuffer.append("xumingxiao");
        stringBuffer.insert(1,"x");
        int length=4;
        //指数拓展策略
        int newCapacity = (length << 1) + 2;//<<1相当于乘以2
        System.out.println(stringBuffer);
    }
}
