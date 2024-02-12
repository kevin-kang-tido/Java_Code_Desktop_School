package java_files_inclasses;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
            public static void main(String[] args) {
                // target file
                Path target = Paths.get("Test.csv");
               //symlink file
                Path symbolicLinkFile = Paths.get("link.csv");
                try{
                    Files.createSymbolicLink(symbolicLinkFile, target);
                    System.out.println("Symbolic link is created successfully!!!");
                }catch (IOException ioException){
                    System.out.println("Problem: " + ioException.getMessage());
                }
            }

}
