package java_files_inclasses.rewritecodeinclass;

import java.io.FileOutputStream;

public class FileOutputStreamToFile {
    public static void main(String[] args) {
        // we want to write some text to the testing file use fileOutputStream
       try{
           FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\sen08\\IdeaProjects\\inheritancefiles.Main\\src\\java_files_inclasses\\rewritecodeinclass\\testing.txt", true);
           String addition = "new title \n";
           fileOutputStream.write(addition.getBytes());
           fileOutputStream.close();
           System.out.println("[+] Text written to the file successfully.");
       }catch (Exception e){
           System.out.println(e.getMessage());
       }

    }
}
