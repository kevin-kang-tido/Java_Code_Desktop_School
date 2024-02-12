package java_files_inclasses;

import java.io.FileWriter;

// full in class
public class FilterWirter {
    public static void main(String[] args) {
        try {
            FileWriter fileWriter = new FileWriter("devopsinclass",true);
            fileWriter.write("Yooo Yoo this is testing testing !");
            fileWriter.close();

        }catch (Exception exception){
            System.out.println(exception.getMessage());
        }
    }
}
