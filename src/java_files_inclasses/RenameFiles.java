package java_files_inclasses;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class RenameFiles {
    public static void main(String[] args) throws IOException {
        // rename files
        Path path = Paths.get("devops.csv");
        Path des = Paths.get("data.csv");
        Files.move(path, des);
    }
}
