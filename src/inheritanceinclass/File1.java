package inheritanceinclass;


import java.util.Scanner;

// super class
class  ParentClass{
    Integer id;
    String name;
    Integer age;
    Double height;
}

class ChildClass extends ParentClass {
    private  final Scanner scanner = new Scanner(System.in);
    void  input(){
        System.out.println("Insert ID: ");
        id = scanner.nextInt();
        System.out.println("Insert Name : ");
        scanner.nextLine();
        name = scanner.nextLine();
        System.out.println("Insert your age: ");
        age = scanner.nextInt();
        System.out.println("Insert your height : ");
        height = scanner.nextDouble();
    }

    void getInformation(){
        System.out.println("+++++++++++++ Print information ++++++++++++++++");
        System.out.println("ID : "+id);
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("Height  : "+height);
    }


}


public class File1 {
    public static void main(String[] args) {
        ChildClass obj = new ChildClass();
        obj.input();
        obj.getInformation();

    }
}
