package access_specifiers_in_java;

public class A1 extends A{

    public static void main(String[] args) {
        A1 a1=new A1();
        // when variable method made private
       // a1.test(); //error
     //   System.out.println(a1.x);// eroor

        // when variable method made default
        a1.test1();
        System.out.println(a1.y);
        // when variable method made protected

    }
}
