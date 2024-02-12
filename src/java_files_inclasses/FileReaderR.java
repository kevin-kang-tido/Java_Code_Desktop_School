package java_files_inclasses;

import java.io.FileReader;

public class FileReaderR {
    public static void main(String[] args) {
        try(FileReader reader = new FileReader("devopsinclass")){
            int data;
            while ((data=reader.read())!=-1){
                System.out.print((char) data);
            }
        }catch (Exception exception){
            System.out.println("Problem: " + exception.getMessage());
        }
    }
}
