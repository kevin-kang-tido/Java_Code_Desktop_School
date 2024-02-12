package java_files_inclasses;

import javax.imageio.IIOException;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PracticeInClass {
    public static void main(String[] args) throws IIOException {
        try{
            // create the file
            Path  path = Paths.get("devopsinclass");
            Files.createFile(path);
            System.out.println("Creating is successfully");
            // rename file
            Path des = Paths.get("renamefile");
            Files.move(path,des);
            System.out.println("This files has been rename!");

            // list file and can delete it
            File file = new File("C:\\Users\\sen08\\IdeaProjects\\inheritancefiles.Main");

            File [] files = file.listFiles();

        }catch (Exception exception){
            System.out.println(exception.getMessage());
        }

    }
}
