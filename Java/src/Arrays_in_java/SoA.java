package Arrays_in_java;

public class SoA {
    public static void main(String[] args) {

        int[] x = {20,15,10,5,2,1};
        int temp;
        for (int j = 0; j < x.length - 1; j++) {
            for (int i = 0; i < x.length - 1; i++) {
                temp = x[i + 1];
                x[i + 1] = x[i];
                x[i] = temp;

            }
        }

        for (int arr : x) {
            System.out.println(arr);
        }
    }
}