package access_specifiers_in_java;

public class C {

    // *************** IMPORTANT  NOTE CONSTRUCTOR CAN NOT BE INHERITED    **************
    // private Access Constructor
    /*
    private C( ){
System.out.println(1000);
   }


    // Default Access Constructor
    C( ){
        System.out.println(10000000);
    }


// protected access constructor

    protected C(){
        System.out.println(10000000);
    }
    */
// public acces specifiers in constructor
public C(){
    System.out.println(10000000);
}
}
