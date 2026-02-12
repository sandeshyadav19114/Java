package Collection_in_java;

import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {

        PriorityQueue<String> pq= new PriorityQueue<>();
        pq.add("Yadavji");
        pq.add("Yadavji");
        pq.add("Yadavjii");
        pq.add("Yadavjiii");
        System.out.println(pq);
        PriorityQueue<Integer> pq1= new PriorityQueue<>();
        pq1.add(10);
        pq1.add(15);
        pq1.add(100);
        pq1.add(105);
        pq1.add(5);
        pq1.add(7);
        System.out.println(pq1);

    }
}
