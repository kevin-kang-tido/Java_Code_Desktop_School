package inheritanceinclass;

class CarTwo {
    Integer id;
    String model;
    String color;

}
class Engine{
    String model;
}
class BMW extends CarTwo {
    // has a relationship cuz engine have obj in BMW
    private final Engine engine = new Engine();
    BMW(Integer id,String model,String color){
        this.id = id;
        this.model=model;
        this.color =color;
    }
    void  getDetail(){
        engine.model = "hOTOOO11";
        System.out.println("Car ID: "+id);
        System.out.println("Car Model: "+model);
        System.out.println("Car color: "+color);

    }
}

public class HasRelationShip {
    public static void main(String[] args) {
        BMW bmw = new BMW(1,"DD))1","red");
        bmw.getDetail();

    }
}
