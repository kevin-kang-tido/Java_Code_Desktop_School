package java_files_inclasses;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreateFiles {
    public static void main(String[] args) {
        try {
            Path path = Paths.get("devops.csv");
            Files.createFile(path);
        }catch (Exception ex){
            return;
        }
    }

}
