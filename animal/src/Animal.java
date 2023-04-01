public class Animal {
    String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat() {
        System.out.println("The animal is eating.");
    }
}

class main {
    public static void main(String[] args) {
        Dog myDog = new Dog("Rex", 3, "Labrador");

        System.out.println("Name: " + myDog.name);
        System.out.println("Age: " + myDog.age);
        System.out.println("Breed: " + myDog.breed);

        myDog.eat();
        myDog.bark();
    }
}