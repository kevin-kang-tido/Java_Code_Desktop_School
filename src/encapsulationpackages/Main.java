package encapsulationpackages;

public class Main {
    public static void main(String[] args) {
        Car obj3 = new Car("khmerbrand","R001",2002);
        System.out.println(obj3.getYear());
        obj3.setMake("china");
        System.out.println(obj3.getMake());

    }
}
