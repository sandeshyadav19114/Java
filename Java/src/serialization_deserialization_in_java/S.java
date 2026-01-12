package serialization_deserialization_in_java;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class S {
    public static void main(String[] args) {
        S1 s =new S1();
        try{
            FileOutputStream fos =new FileOutputStream("D:\\filehandlinginjava\\t1.txt");

            ObjectOutputStream oos =new ObjectOutputStream(fos);
            oos.writeObject(s);
            oos.close();
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
