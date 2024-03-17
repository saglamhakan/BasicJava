package kodlab.collections;

import java.util.LinkedList;

public class LinkedListClass {
    public static void main(String[] args) {
        LinkedList<Object> list = new LinkedList<>(); //Başa ve sona elaman eklemek için kullanılır
        list.add(1);
        list.add(2);
        list.add(3);
        list.addFirst(4);
        list.addLast(5);
        list.forEach(System.out::println);
    }
}
