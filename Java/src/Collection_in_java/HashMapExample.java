package Collection_in_java;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {

        System.out.println("Sandesh".hashCode());
        HashMap<String ,Integer> hm= new HashMap<>();
        hm.put("81115825767",2026);
        hm.put("5",2939);
        hm.put("8263030148",2025);
        hm.put("81115825767",2024);
        hm.put("81115825768",2024);
        hm.put("81115825769",2024);
        hm.put("811158257670",2024);

        System.out.println(hm);
        System.out.println(hm.remove("81115825769"));
        System.out.println(hm);

    }
}
