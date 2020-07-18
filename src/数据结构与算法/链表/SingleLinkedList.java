package 数据结构与算法.链表;

/**
 * Created by xu on 2020/3/18.
 */
public class SingleLinkedList {
    ListNode head = null;

    /**
     * 链表头添加
     *
     * @param data
     */
    public void addHead(int data) {
        ListNode node = new ListNode(data);
        node.next = head;
        head = node;
    }

    /*
    打印
    */
    public void printLink() {
        ListNode curNode = head;
        while (curNode != null) {
            System.out.print(curNode.val + " ");
            curNode = curNode.next;
        }
        System.out.println();
    }


//长度

    public int length() {
        int length = 0;
        ListNode tmp = head;
        while (tmp != null) {
            length++;
            tmp = tmp.next;
        }
        return length;
    }


    /**
     * 在尾部插入
     *
     * @param data
     */
    public void addLast(int data) {
        ListNode node = new ListNode(data);
        ListNode temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
    }

    //按索引插入
    public void insertByIndex(int index, int data) {
        ListNode node = new ListNode(data);
        if (index < 0 || index > length()) {
            System.out.println("位置不对啊，小老弟");
            return;
        }
        int length = 1;
        ListNode tmp = head;
        while (tmp.next != null) {
            length++;
            tmp = tmp.next;
            if (index == length) {
                node.next = tmp.next;
                tmp.next = node;
                return;
            }
        }
    }


    //方法2
    public void insertByIndex2(int index, int data) {
        ListNode node = new ListNode(data);
        ListNode temp = head;
        if (index < 0 || index > length()) {
            System.out.println("位置不对啊，小老弟");
            return;
        } else if (index == 0) {
            node.next = head;
            head = node;
        } else {
            for (int i = 1; i < index; i++) {
                temp = temp.next;
            }
            ListNode nextNode = temp.next;
            temp.next = node;

            node.next = nextNode;
        }
    }

    //替换
    public void replaceByIndex(int index, int data) {
        ListNode node = new ListNode(data);
        ListNode temp = head;
        if (index < 0 || index > length()) {
            System.out.println("位置不对啊，小老弟");
            return;
        } else if (index == 0) {

            node.next = head.next;
            head = node;
        } else {
            for (int i = 1; i < index; i++) {
                temp = temp.next;
            }
            ListNode nextNode = temp.next.next;
            temp.next = node;

            node.next = nextNode;
        }
    }

    //按索引删除
    public void deleteByIndex(int index) {
        ListNode temp = head;
        if (index < 0 || index > length()) {
            System.out.println("位置不对啊，小老弟");
            return;
        } else if (index == 0) {
            head = head.next;
        } else {
            for (int i = 1; i < index; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }
    }


    public static void main(String[] args) {
        SingleLinkedList list = new SingleLinkedList();
        list.addHead(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        list.printLink();
    }
}
