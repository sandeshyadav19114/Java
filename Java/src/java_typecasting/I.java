package java_typecasting;

public class I {
    public static void main(String[] args) {


        //  Automatic conversion large to small  Formate (byte → short → int → long → float → double)
        int a = 10;
        double b = a;  // int → double (automatic)

        System.out.println(a);  // 10
        System.out.println(b);  // 10.0
    }

}
