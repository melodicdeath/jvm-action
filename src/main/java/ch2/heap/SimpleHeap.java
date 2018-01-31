package ch2.heap;

/*
* 1.将SimpleHeap类加载到方法区
* 2.new SimpleHeap(1)、new SimpleHeap(2)放入堆
* 3.s1、s2放入栈
* */

public class SimpleHeap {
    private int id;

    public SimpleHeap(int id) {
        this.id = id;
    }

    public void show() {
        System.out.println("My ID is " + id);
    }

    public static void main(String[] args) {
        SimpleHeap s1 = new SimpleHeap(1);
        SimpleHeap s2 = new SimpleHeap(2);
        s1.show();
        s2.show();
    }
}
