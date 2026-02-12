package Collection_in_java;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("\n Java");
        ll.add("\nPython");
        ll.add("\nc++");
        ll.add("\noops");
        ll.add("\nos");
        ll.add("");
        ll.add("\n c language");
        System.out.println(ll);
        System.out.println(ll.get(1));
        System.out.println(ll.getFirst());
        System.out.println(ll.getLast());
        System.out.println(ll.remove(1));
        System.out.println(ll);


    }
}
