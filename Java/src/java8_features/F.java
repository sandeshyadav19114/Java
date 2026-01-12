package java8_features;
@FunctionalInterface
public interface F {

    // should consist of exactly one incomplete method
    public void test500();



   default public void test508(){

   }
    default public void test509(){

    }
}
