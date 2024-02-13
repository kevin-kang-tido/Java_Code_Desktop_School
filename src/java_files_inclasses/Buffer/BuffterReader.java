package java_files_inclasses.Buffer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BuffterReader {
    public static void main(String[] args) {
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("files.csv"))){
            String data;
            while ((data=bufferedReader.readLine())!=null){
                System.out.println(data);
            }
        }catch (IOException ioException){
            System.out.println(ioException.getMessage());
        }
        
    }
}
