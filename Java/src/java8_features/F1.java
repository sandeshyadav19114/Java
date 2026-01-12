package java8_features;
public class F1 implements F {

    public static void main(String[] args) {
        F1 s1 =new F1();
        s1.test500();
        s1.test508();
        s1.test509();
    }
    @Override
    public void test500() {
        System.out.println(4000);
    }

    @Override
    public void test508() {
        System.out.println(4000);
    }
    @Override
    public void test509() {
        System.out.println(49000);
    }
}
