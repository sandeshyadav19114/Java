package file_handling_in_java;

import java.io.File;
import java.io.IOException;

public class FH {
    public static void main(String[] args)  {
        File f= new File("D:\\file-handling -in -java"); // File
        System.out.println(f);
      boolean val2= f.mkdir();
        System.out.println(val2);  // creating new folder

        try {
            boolean val4 = f.createNewFile();    // creating new file
            System.out.println(val4);
        }catch (IOException e){
            e.printStackTrace();
        }


  //  boolean val = f.delete();
     //   System.out.println(val);    // delete file

      boolean val1 =f.exists();
     System.out.println(val1);   // exist file

        long val3=f.length();
        System.out.println(val3);  // count length of character

String [] v1 = f.list();
for ( String arr1 : v1){   // list in file handling
    System.out.println(arr1);
   System.out.println(arr1.length());
}

    }
}
