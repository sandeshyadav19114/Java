package java_typecasting;

public class D1 extends D {
    public static void main(String[] args) {
        D d1=new D1();
        if ( d1 instanceof D1){
            D1 d2= (D1) d1;
            System.out.println("Downcasting Succcessfully ");
        }
    }
}
