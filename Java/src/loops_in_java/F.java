package loops_in_java;

public class F {
    public static void main(String[] args) {
        int i=0;
        for (i=0;i<20;i++){
          //  System.out.println(i);

            // continue keyword in java
            if (i==15){
                continue;
            }
            System.out.println(i);

        }
    }
}
