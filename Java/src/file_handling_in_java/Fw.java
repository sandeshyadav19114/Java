package file_handling_in_java;

import java.io.FileWriter;

public class Fw {
    public static void main(String[] args) {
        try{
            FileWriter fw= new FileWriter("D:\\filehandlinginjava\\t2.txt");
            fw.write(811582576);
            fw.write("sandesh yadav ji");

            fw.close();
            fw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
