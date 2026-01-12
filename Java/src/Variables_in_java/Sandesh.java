package Variables_in_java;

public class Sandesh {

    //Static Variable in java
    static int y = 20; //Static Variable in java
    //Non Static Variable in java
    int x = 15;
    // Reference Variable in java
    String z;

    public static void main(String[] args) {

        //Object in java
        Sandesh v = new Sandesh();

        // Non-static variables accessible through object only
        System.out.println(v.x);

        //Static variables accessible directly
        System.out.println(y);

        //Local Variable in Java
        int z = 100;
        System.out.println(z);

        //Reference Variable in java
        v.z = "Sandesh Yadav";
        System.out.println(v.z);
    }
}