package java_files_inclasses;

import java.io.File;

public class File1 {
    public static void main(String[] args) {
        try{
            File file = new File("game.txt");
            if(file.createNewFile()){
                System.out.println("Created file successfully");
            }else {
                System.out.println("Exited.");
            }
        }catch (Exception exception){
            System.out.println(exception.getMessage());
        }
    }
}
