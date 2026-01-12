package scanner_class_in_java;

import java.util.Scanner;

public class S {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Your Name :");
        String name = scan.nextLine();   // for read multiple string word using nextline  method
        System.out.println("Your Name is " + name);

        System.out.println("Enter Your Age:");
        int age = scan.nextInt();
        System.out.println("Your Age is  "+ age);

        System.out.println("Enter Your Weight :");
        float weight = scan.nextFloat();
        System.out.println("Your Weight Is :" +weight);

        System.out.println("Enter Your Answer ");
        boolean b = scan.hasNextBoolean();
        System.out.println("Your Answer is :" + b);

        scan.close();
    }
}
