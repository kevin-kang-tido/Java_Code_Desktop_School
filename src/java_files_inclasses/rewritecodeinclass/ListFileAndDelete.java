package java_files_inclasses.rewritecodeinclass;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class ListFileAndDelete {
    public static void main(String[] args) {
        try{
            // get list of files
            File file = new File("C:\\Users\\sen08\\IdeaProjects\\inheritancefiles.Main\\src\\java_files_inclasses\\rewritecodeinclass");
            File [] files  = file.listFiles();
            assert files != null;
            System.out.println("Enter file name your want to delete: ");
            String fileNameToDelete = new Scanner(System.in).nextLine();


            System.out.println("Here is the list of file : ");
            // this is foreach loop
            // loop for see list files
            for (File fileName:files){
                // compare name file
                if (fileNameToDelete.equalsIgnoreCase(fileName.getName())){
                    fileName.delete();
                    System.out.println("The file "+fileNameToDelete+"has been deleted!");
                }
                // list all file name
//                System.out.println(fileName.getName());
            }
        }catch (Exception exception){
            System.out.println(exception.getMessage());
        }

    }
}
