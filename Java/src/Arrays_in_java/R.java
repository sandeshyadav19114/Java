package Arrays_in_java;

public class R {
    public static void main(String[] args) {
// Removing Duplicate element from an array
        int[] x = {2, 3,3, 4, 5, 6, 7, 8, 9, };
        int[] temp = new int[x.length];
        int j = 0;
        for (int i = 0; i < x.length - 1; i++) {
            if (x[i] != x[i + 1]) {
                temp[j] = x[i];
                j++;
            }
        }

        // Add last element
        temp[j] = x[x.length - 1];
        j++;

        // Print result
        for ( int arr: temp) {
            System.out.println(arr);
        }
    }
}


