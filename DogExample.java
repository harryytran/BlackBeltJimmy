public class DogExample {
    public static void main(String[] args) {
        // This is where we create and use our Dog object
        // It demonstrates how we interact with objects in OOP
        Dog myDog = new Dog("Buddy", "Labrador", 3);
        
        // Using getters
        System.out.println("My dog's name is " + myDog.getName());
        System.out.println("He is a " + myDog.getBreed());
        System.out.println("He is " + myDog.getAge() + " years old");

        // Using setters
        myDog.setName("Max");
        myDog.setAge(4);

        System.out.println("My dog's new name is " + myDog.getName());
        System.out.println("He is now " + myDog.getAge() + " years old");

        // Using other methods
        myDog.bark();
        myDog.eat();
        myDog.sleep();

        // Demonstrating validation in setter
        myDog.setAge(-1); // This should print an error message
    }
}

class Dog {
    // Encapsulation: These private variables are hidden from outside access
    private String name;
    private String breed;
    private int age;

    // Constructor: This is used to create new Dog objects
    public Dog(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    // Getters: These provide controlled access to our private variables (Encapsulation)
    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public int getAge() {
        return age;
    }

    // Setters: These allow controlled modification of our private variables (Encapsulation)
    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setAge(int age) {
        // Abstraction: The logic for age validation is hidden inside this method
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Age must be positive!");
        }
    }

    // Other methods: These represent behaviors of the Dog (Abstraction)
    public void bark() {
        System.out.println(name + " says: Woof!");
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }

    public void sleep() {
        System.out.println(name + " is sleeping.");
    }
}