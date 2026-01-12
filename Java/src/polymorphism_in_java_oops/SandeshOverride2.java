package polymorphism_in_java_oops;

public class SandeshOverride2 extends SandeshOverride1 {
    @Override
    public void onlineBanking(){
        System.out.println("Yes off course");
    }
    @Override
    public void rate_of_Interest(){
        System.out.println("7% can be implement");
    }

    public static void main(String[] args) {
        SandeshOverride2 s2 =new SandeshOverride2();
        s2.onlineBanking();
        s2.rate_of_Interest();
        System.out.println("_____");
        SandeshOverride1 s1=new SandeshOverride1();
        s1.onlineBanking();
        s1.rate_of_Interest();
    }

}
