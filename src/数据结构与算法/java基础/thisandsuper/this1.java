package 数据结构与算法.java基础.thisandsuper;

public class this1 {
        private String name;
        private int age;

        public this1() {
        }

        public this1(String name) {
            this.name = name;
        }
        public this1(String name, int age) {
            this(name);
            this.age = age;
        }
}
