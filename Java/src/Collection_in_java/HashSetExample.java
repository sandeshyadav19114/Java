package Collection_in_java;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
    public static void main(String[] args) {
// Union Operations  (A ∪ B)
        HashSet<Integer> A = new HashSet<>();
        A.add(1);
        A.add(2);
        A.add(3);

        HashSet<Integer> B = new HashSet<>();
        B.add(3);
        B.add(4);
        B.add(5);

        HashSet<Integer> union = new HashSet<>(A);
        union.addAll(B);

        System.out.println(union); // [1, 2, 3, 4, 5]

        // Intersection Operation  (A ∩ B)
        HashSet<Integer> intersection = new HashSet<>(A);
        intersection.retainAll(B);
        System.out.println(intersection); // [3]


        // Difference Operation (A − B)
        HashSet<Integer> difference = new HashSet<>(A);
        difference.removeAll(B);

        System.out.println(difference); // [1, 2]

       // Subset Operation

        System.out.println(A.containsAll(intersection)); // true


        HashSet<String> h=new HashSet<>();
        h.add("Yadav ji ");
        h.add("Yadav ji ");
        h.add("Yadav jii ");
        h.add(" ");
        h.add("Yadavji ");
        h.add(" Sandesh Yadav ji ");
        System.out.println(h);
        Iterator<String > itr= h.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
            System.out.println(h.contains("Yadavji "));
            h.remove(" Sandesh Yadav ji ");
            System.out.println(h);
        }
    }
}
