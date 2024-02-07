package TestPolyInOOP;

class Animal {
    public void makeSound() {
        System.out.println("Some sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}
public class Main {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.makeSound(); // Output: Woof
        if (animal instanceof Dog) {
            System.out.println("Animal is a Dog");
        }

        animal = new Cat();
        animal.makeSound(); // Output: Meow
        if (animal instanceof Cat) {
            System.out.println("Animal is a Cat");
        }

    }
}
