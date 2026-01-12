package serialization_deserialization_in_java;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class D {
    public static void main(String[] args) {
        try{

            FileInputStream fis = new FileInputStream("D:\\filehandlinginjava\\t1.txt");
            ObjectInputStream ois =new ObjectInputStream(fis);
            S1 s12 = (S1)  ois .readObject();
            System.out.println(s12.name);
            System.out.println(s12.password);
            ois.close();
        } catch (Exception e) {
           e.printStackTrace();
        }
    }
}
