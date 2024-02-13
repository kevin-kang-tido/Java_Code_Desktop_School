package java_files_inclasses.serialization;

import java.io.Serial;
import java.io.Serializable;

class  Book implements Serializable{

    // use a unit id for class Book
    @Serial
    private  static final  long serialVersionUID = 23L;
    private  Integer id;
    private  String title;
    private  String description;
    // I create a in constructor
    public  Book(Integer id, String tile, String description){
        this.id = id;
        this.title = tile;
        this.description = description;
    }


}
public class serializaltionTesting {
    public static void main(String[] args) {



    }
}
