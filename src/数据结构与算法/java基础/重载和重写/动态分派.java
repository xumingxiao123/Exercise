package 数据结构与算法.java基础.重载和重写;


/**
 * @Description: 方法动态分派演示
 * @version: v1.0.0
 */
class DynamicDispatch {

    static abstract class Animal{
        protected abstract void sayHello();
    }

    static class Bird extends Animal{

        @Override
        protected void sayHello() {
            System.out.println("Bird say hello");
        }

    }

    static class Eagle extends Animal{
        @Override
        protected void sayHello() {
            System.out.println("Eagle say hello");
        }

    }

    public static void main(String[] args){
        Animal bird = new Bird();
        Animal eagle = new Eagle();
        bird.sayHello();
        eagle.sayHello();
        bird = new Eagle();
        bird.sayHello();
    }
}
