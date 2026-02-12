package Collection_in_java;

import java.util.Iterator;

public class ArrayListExample {

    public static void main(String[] args) {
        java.util.ArrayList<String> arr=new java.util.ArrayList<>();
        arr.add(" \n Sandesh Yadav ");
        arr.add(" ");
        arr.add("\n Sachin  Yadav ");
        arr.add(" \n Yadav ji  ");
        arr.add("\n Shivam Yadav ");
        arr.add("\n Sandesh Yadav ");

      //  Iterator in Array List

        Iterator<String>  itr = arr.iterator();
// Get Iterator
           while (itr.hasNext()) {
               String arr1 = itr.next();
               System.out.println(arr1);

// Traverse using Iterator
               if (arr1.equals(" Sandesh Yadav ")) {
                   itr.remove();

               }
           }

        System.out.println(" \n After Removing this element 'Sandesh Yadav' : " + arr);

        System.out.println(arr);

        System.out.println(arr.size());

        arr.add(1  ,"Yadavjiii" );

        arr.set(5,"Yes");

        System.out.println(arr);

        System.out.println(arr.get(1));

        System.out.println(arr.getFirst());

        System.out.println(arr.getLast());

        arr.remove(1);

        arr.removeFirst();

        arr.removeLast();

        System.out.println(arr);

        System.out.println(arr.reversed());

        System.out.println(arr.contains("Yadav ji"));
    }
}
