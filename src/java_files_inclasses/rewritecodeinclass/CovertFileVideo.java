package java_files_inclasses.rewritecodeinclass;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CovertFileVideo {
    public static void main(String[] args) {
        // Start reading data from source file (WMV) 8ulws
        try(FileInputStream fileInputStream = new FileInputStream("video.wmv")){
        // Start writing data from destination file (MP4)
            try(FileOutputStream fileOutputStream = new FileOutputStream("video.mp4")) {
                fileOutputStream.write(fileInputStream.readAllBytes());
                System.out.println("[+] Converted from WMV file to MP4 file successfully.");
            }
        }catch (Exception exception){
            System.out.println("Problem: "+exception.getMessage());
        }

    }
}
