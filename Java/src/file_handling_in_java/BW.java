package file_handling_in_java;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class BW {
    public static void main(String[] args) {
        try{
            FileWriter fw=new FileWriter("D:\\filehandlinginjava\\t1.txt");

            BufferedWriter bw=new BufferedWriter(fw);

           bw.write("sandesh yadav buffer writer example");

            bw.write(1234567);

            bw.close();
            bw.close();
            fw.close();
        } catch (Exception e) {
          e.printStackTrace();
        }
    }
}
