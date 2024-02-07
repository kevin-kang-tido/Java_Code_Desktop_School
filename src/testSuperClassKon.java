public class testSuperClassKon extends testsuperclass {
    public static void main(String[] args) {
        testSuperClassKon obj1 = new testSuperClassKon();
        obj1.name= "mr kevin";
        obj1.id = 12;
        obj1.age =122;
        obj1.display();
    }
    @Override
    void display() {
        System.out.println("This is your name ; "+name);
        System.out.println("This is your id : "+id);
        System.out.println("This is your age:  "+age);
        System.out.println("Hello sub class 1 ");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
    }
}

