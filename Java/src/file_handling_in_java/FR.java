package file_handling_in_java;

import java.io.File;
import java.io.FileReader;

public class FR {
    public static void main(String[] args) {
        try{
            File f= new File("D:\\filehandlinginjava\\t1.txt");

            FileReader fr = new FileReader(f);
            for ( int i=0; i< f.length();i++){
                System.out.println((char) fr.read() );
            }
            fr.close();
        }catch ( Exception e){
            e.printStackTrace();
        }
    }

}
