package exception_handling_in_java;

public class E1 {
    int x = 100;

    // THERE ARE TWO TYPES OF EXCEPTION
    //    1. COMPILE TIME EXCEPTION - occure during compilation  2. RUN TIME EXCEPTION - occure during runtime
//a- Airthmatic exception  in java
    public static void main(String[] args) {
        try {
            int x = 10;
            int y = 0;
            int z = x / y;
            System.out.println(z);
        } catch (ArithmeticException a) {
            a.printStackTrace();
        }
        System.out.println("welcome");
/*
        //  b- Null pointer exceptionnin java

        try {
            E1 a1 = null;
            System.out.println(a1.x);
        } catch (NullpointerException e) {
            e.printStackTrace();
        }
        System.out.println("welcome");
    }
    */
}


    }
