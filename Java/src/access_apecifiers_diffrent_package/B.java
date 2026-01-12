package access_apecifiers_diffrent_package;

import access_specifiers_in_java.A;

public class B extends A {
    public static void main(String[] args) {
        B b=new B();
        b.test2();
        System.out.println(b.z);

        B b1 =new B();
        b1.test60();
        System.out.println(b1.a);
    }
}
