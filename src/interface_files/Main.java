package interface_files;
import interfacetwo.*;
public class Main {
    // testing packages import
    public static void main(String[] args) {
        interfacetwo.Main.PostSMS obj = new interfacetwo.Main.PostSMS();
        System.out.println("this is interface_two");
        obj.sms();
        obj.display();

    }

}
