package streamapi.f;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class SAPI {
    public static void main(String[] args) {
        List<Integer> arr= Arrays.asList(10,30,40,38,50,31,34,90);
        List<Integer> newArr=arr.stream().filter(x->x%2==0).collect(Collectors.toList());
        System.out.println(newArr);
    }
}
