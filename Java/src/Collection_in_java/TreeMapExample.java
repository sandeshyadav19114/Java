package Collection_in_java;

import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<String ,Integer> tm=new TreeMap<>();
        tm. put("81158257567",344445);
        tm. put("81158257568",344447);
        tm. put("81158257569",344445);
        tm. put("81158257560",344445);
        tm.put("1",2333333);
        System.out.println(tm);
        System.out.println(tm.get("81158257567"));
    }
}
