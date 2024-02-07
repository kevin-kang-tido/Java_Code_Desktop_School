package inheritanceinclass;

class Car{
    Integer id;
    String model;
}
class Frod extends CarTwo {
    Frod(Integer id,String model){
        super.id = id;
        super.model = model;
    }
    void getInformation(){
        System.out.println("THis is ID : "+super.id);
        System.out.println("THis is Model : "+super.model);
    }
}
public class SuperKeyword {
    public static void main(String[] args) {
        Frod frod = new Frod(12,"hhee");
        frod.getInformation();

    }
}
