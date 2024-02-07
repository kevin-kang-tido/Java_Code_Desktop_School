package Inheriance;
import java.util.Scanner;

abstract  class Person{
    String name;
    int aga;
    String address;
   Scanner input = new Scanner(System.in);
    abstract void input();
    abstract void  output();



}
class Student extends Person {
    int studentId;
    @Override
    void input() {
        System.out.println("Student name : ");
        name = input.nextLine();
        System.out.println("Student Address : ");
        address = input.nextLine();
    }
    @Override
    void output() {
        System.out.println("Student name : "+name);
        System.out.println("Student Address : "+address);
    }
}
class Worker extends Person{
    int hour;
    int priceOfHour;
    @Override
    void input() {
        System.out.println("Enter your time  : ");
        hour = input.nextInt();
        System.out.println("Enter your Price per Hour : ");
        priceOfHour = input.nextInt();

    }
    @Override
    void output() {
        System.out.println("Your time :  "+hour);
        System.out.println("Your price per hour : "+priceOfHour);
        System.out.println("This is your price today : "+(hour*priceOfHour)+"$");
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner cc = new Scanner(System.in);
        int n;
        System.out.println("Enter N :");
        n = cc.nextInt();
        Person obj = new Worker();
        Person obj1 = new Student();
        int option;

        System.out.println(
                """
                Choose your Option (1 or 2!)
                1.Student
                2.Worker 
                """
        );
        System.out.println("Choose your Option: ");
        option = cc.nextInt();
        switch (option){
            case 1:
                System.out.println("======== Student =====");
                for(int i = 0; i<n; i++){
                    obj1.input();
                    obj1.output();
                    System.out.println(">>>>>>>>>>>>>> student << "+(i+1)+" >>");
                }
                break;
            case 2:
                System.out.println("======== Worker =====");
                for(int i = 0; i<n; i++){
                    obj.input();
                    obj.output();
                    System.out.println(">>>>>>>>>>>>>> Worker<< "+(i+1)+" >>");
                }
                break;

        }


    }
}
