package java_typecasting;

public class E {
    public static void main(String[] args) {
        double x = 9.78;
        int y = (int) x;  // double → int (explicit)

        System.out.println(x);  // 9.78
        System.out.println(y); // 9 (decimal lost)

    }
}
