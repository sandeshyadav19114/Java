package streamapi.f;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SAPI1 {
    public static void main(String[] args) {
        List<String> arr= Arrays.asList("Sandesh","yadav","Sachin","Yadav ji");
        List<String> newArr=arr.stream().filter(string->string.startsWith("S")).collect(Collectors.toList());
        System.out.println(newArr);
    }
}
