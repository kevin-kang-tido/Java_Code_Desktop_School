package has_a_relationship;
class ClassInAnotherClass {
    Integer id;
    String model;
    String color;
    Integer year;
    Integer push;
    Integer speed;
}
class EngineOfClass{
    String model;
    Integer year;
}
class Gas{
    Integer push;
    Integer speed;
}
class BM extends ClassInAnotherClass{
    // has a relationship (BM has a relationship with EngineOfClass)
    EngineOfClass engineOfClass = new EngineOfClass();
    Gas gas = new Gas();
    BM(Integer id, String model,String color,Integer push,Integer speed){
        this.id = id;
        this.model = model;
        this.color = color;
        this.push = push;
        this.speed = speed;

    }
    void getInformation(){
        engineOfClass.model="DD2233";
        gas.push=1232;
        gas.speed = 2132332;
        engineOfClass.year=2023;
        System.out.println("Car Model is : "+model);
        System.out.println("Car color is : "+color);
        System.out.println("Car id is : "+id);
        System.out.println("Car push is : "+push);
        System.out.println("Car speed is : "+speed);
    }
}
public  class Main{
    public static void main(String[] args) {
        BM bm = new BM(12,"dd","red",12,23332);
        bm.getInformation();

    }

}



