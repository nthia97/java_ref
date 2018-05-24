package LinkedList;

import java.util.LinkedList;

public class TestLinkedList {
    public static void main(String[] args) {
        LinkedList<String> linkedList=new LinkedList<String>();
        linkedList.add("one");
        linkedList.add("two");
        linkedList.add("three");
        linkedList.add("four");

        System.out.println(linkedList.toString());
        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());
    }
}
