package Collection_in_java;

import java.util.ArrayDeque;

public class ArrayDequeExample {
    public static void main(String[] args) {
        ArrayDeque<String> ad=new ArrayDeque<>();
        ad.add("yes");
        ad.add(" ");
        ad.add("yess");
        ad.add("yes");
        System.out.println(ad);
        ArrayDeque<Integer> pq1= new ArrayDeque<>();
        pq1.add(10);
        pq1.add(15);
        pq1.add(100);
        pq1.add(105);
        pq1.add(5);
        System.out.println(pq1);
    }
}
