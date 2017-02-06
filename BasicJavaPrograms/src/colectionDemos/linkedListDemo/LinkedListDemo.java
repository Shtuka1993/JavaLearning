package colectionDemos.linkedListDemo;

import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<String>();
        ll.add("A");
        ll.add("B");
        ll.addFirst("C");
        ll.addLast("D");
        for(int i=0;i<ll.size();i++)
            System.out.println("Element "+i+" : " + ll.get(i));
        System.out.println("First Element:"+ll.getFirst());
        System.out.println("Last Element:"+ll.getLast());
        System.out.println("Index of 'B':"+ll.indexOf("B"));
        System.out.println("Removed First Element:"+ll.removeFirst());
        while(!ll.isEmpty())
            System.out.println("Element Removed:"+ll.remove());
        System.out.println("Size:"+ll.size());
    }

}
