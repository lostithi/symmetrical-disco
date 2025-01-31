//INTERFACES----------------------------------------------------
// INTERFACES  -reference type in Java that defines a contract that classes can implement
//             -It allows different classes to implement the same set of methods, promoting a common behavior
//             mETHODS-ABSTRACT-no body->classes must provide implementations
//                    -STATIC-Methods that belong to the interface itself and can be called without an instance.
//                    -DEFAULT-has body and behavior>-oVERRIDEABLE AND REUSABLE FOR CLASSES
//ABStract methods only declared in initial interfaces w/o implementation.They speciifes contract that {classes must fulfill!!!!!!}-Classes Must provide implementation for all abstract methods.
//If body is present-DEFAULT method.==REUSABLE and classes can choose to use  default implementation/override it with their own.Also add DEFAULT KEYWORD for thiss!!!!!

// VARIABLES in interfaceS-public/STATIC/final
// IMPLEMENTS-used to usE/adopt the interface
//


// Step 1: Define the interface
interface Animal {
    void makeSound(); // Abstract method

    default void sleep() { // Default method
        System.out.println("Sleeping...");
    }

}

// Step 2: Implement the interface in classes
class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Bark");
    }
}

class Cat implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}

// Step 5: Main class to use the interface
public class interfaceexample{
        public static void main(String[] args) {
        Animal dog = new Dog(); // Create a Dog instance
        dog.makeSound(); // Outputs: Bark
        dog.sleep(); // Outputs: Sleeping...

        Animal cat = new Cat(); // Create a Cat instance
        cat.makeSound(); // Outputs: Meow
        cat.sleep(); // Outputs: Sleeping...
    }
}


