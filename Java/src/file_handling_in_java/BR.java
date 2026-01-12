package file_handling_in_java;

import java.io.BufferedReader;
import java.io.FileReader;
public class BR {
    public static void main(String[] args) {
        try{
            FileReader fr= new FileReader("D:\\filehandlinginjava\\t1.txt");
            BufferedReader br = new BufferedReader(fr);
            System.out.println( (char)br.read());

            br.read();
            br.close();
            fr.close();
        } catch (Exception e) {
            throw new RuntimeException(e);

        }
    }
}
