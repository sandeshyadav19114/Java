package initilialization_block_in_java;

public class IIB {
    {
        System.out.println("IIB Executed");
    }
    IIB(){
        System.out.println("Constructor Executed ");

    }

    public static void main(String[] args) {
         IIB i = new IIB();
    }
}
