package java_files_inclasses.rewritecodeinclass;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreateFiles {
    public static void main(String[] args) {
        try{
            // create in subpackage (in _ subpackage)
            Path path = Paths.get("C:\\\\Users\\\\sen08\\\\IdeaProjects\\\\inheritancefiles.Main\\\\src\\\\java_files_inclasses\\\\rewritecodeinclass\\\\testing.txt");
            Files.createFile(path);
            System.out.println("Creating is Successfully!!!");
        }catch (Exception e){
            System.out.println("Problem: "+e.getMessage());
        }
    }
}
