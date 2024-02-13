package java_files_inclasses.rewritecodeinclass;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CovertJpgToPng {
    public static void main(String[] args) {
        try {
            // read file img.jpg
            FileInputStream fileInputStream = new FileInputStream("img.jpg");
            try {
                // write file img.jpg to img.png
                FileOutputStream fileOutputStream = new FileOutputStream("ocean.png");
                fileOutputStream.write(fileInputStream.readAllBytes());
                System.out.println("[+] File changing name  is successfully !!!");
                fileOutputStream.close();

            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }catch (Exception e){
            System.out.println("Problem: "+e.getMessage());
        }
    }
}
