package 学习中代码.java基础.重载和重写;

public class 重载 {
    public static void sayhello(int s){
        System.out.println("这是int类型的参数");
    }
    public static int sayhello(char s){
        System.out.println("这是char类型的参数");
        return 0;
    }

    public static void main(String[] args) {
        sayhello(1);
        sayhello('a');
    }
}
