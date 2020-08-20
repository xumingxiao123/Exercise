package 数据结构与算法.java基础.重载和重写;


    /**
     * @Description: 方法静态分派演示
     * @version: v1.0.0
     */
    class StaticDispatch {

        static abstract class Animal{

        }

        static class Bird extends Animal{

        }

        static class Eagle extends Animal{

        }

        public void sayHello(Animal animal) {
            System.out.println("hello,animal");
        }

        public void sayHello(Bird bird) {
            System.out.println("hello,I'm bird");
        }

        public void sayHello(Eagle eagle) {
            System.out.println("hello,I'm eagle");
        }

        public static void main(String[] args){
            Animal bird = new Bird();
            Animal eagle = new Eagle();
            StaticDispatch sd = new StaticDispatch();
            sd.sayHello(bird);
            sd.sayHello(eagle);
        }
    }

