package java8_features;
@FunctionalInterface

public interface L1 extends L {
    default public void test170(){
        System.out.println(40000);
    }
    public static void main(String[] args) {

        //    <<<<<<<<<  --------------  ************* Lambdas Expressions **************   -------->>>>>>>
     L1 f1= () -> {
System.out.println(4959);
     };
    f1.test8();
    f1.test170();

    }
}
