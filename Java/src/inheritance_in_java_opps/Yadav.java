package inheritance_in_java_opps;

public class Yadav extends Sandesh {
    public void engineer(){
        System.out.println("Engineer");
    }


    public static void main(String[] args) {
        Sandesh s=new Sandesh();
        s.test();
        s.test1();
        s.fullstackengineer();
    }
}
