package loops_in_java;

public class FE {
    public static void main(String[] args) {
        int [] age= new int[5];
        age[0]=10;
        age[1]=200;
        age[2]=3000;
        for (int x :age){
            System.out.println(x);
        }
    }
}
