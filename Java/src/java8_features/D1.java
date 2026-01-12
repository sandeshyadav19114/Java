package java8_features;

public class D1 implements D{
    public static void main(String[] args) {
        D1 d=new D1();
        d.test25();
        d.test26();
        d.test27();
        d.test24();
    }

    @Override
    public void test25() {
        D.super.test25();
    }
@Override
public void test27(){
        D.super.test27();
}
    @Override
    public void test26() {
       System.out.println(457487137);
    }

    @Override
    public void test24() {
        System.out.println(457497137);
    }
}
