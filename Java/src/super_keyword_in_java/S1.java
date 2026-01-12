package super_keyword_in_java;

public class S1 extends S {

    void test50() {
        // access variable
        System.out.println(super.x);
        // access method
        super.test99();
    }
    // access constructor
    S1(){
        super();
        System.out.println("hello welcome to here ");
    }
    public static void main(String[] args) {
       S1 s1=new S1();
        s1.test50();
    }
}