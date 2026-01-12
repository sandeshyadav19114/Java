package access_specifiers_in_java;

public class A {

    //when variable method is made private
    private int x=100;
    private void test() {
        System.out.println("yadav ji ");

    }
//when variable method is made default
        int y = 500;
        void test1() {
            System.out.println("yadav ji 1 ");
        }
// when variable method made protected
    protected int z=300;
 protected void test2() {
        System.out.println("yadav ji 2 ");
    }
    // when variable method made public
    public  int a =300;
    public  void test60() {
        System.out.println("yadav ji 3");
    }

    public static void main(String[] args) {
        A a=new A();
        System.out.println(a.x);
        a.test();
    }
}
