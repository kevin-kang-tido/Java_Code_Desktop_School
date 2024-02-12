import javax.imageio.IIOException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class javafile_inclass {
    public static void main(String[] args) throws IOException {

        // rename files
        Path path = Paths.get("devops.csv");
//        Files.createFile(path);
        Path des = Paths.get("data.csv");
        Files.move(path, des);






        // create file




    }
}
