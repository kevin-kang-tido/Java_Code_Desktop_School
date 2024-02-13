package java_files_inclasses.rewritecodeinclass;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadAndWriteFiles {
    public static void main(String[] args) {
        try {
            // read all data in testing file
            FileInputStream fileInputStream = new FileInputStream("C:\\\\Users\\\\sen08\\\\IdeaProjects\\\\inheritancefiles.Main\\\\src\\\\java_files_inclasses\\\\rewritecodeinclass\\\\testing.txt");
            int data;
            while ((data = fileInputStream.read()) != -1) {
                System.out.print((char) data);
            }
            fileInputStream.close();
        } catch (IOException ioException) {
            System.out.println(ioException.getMessage());
        }
    }
}