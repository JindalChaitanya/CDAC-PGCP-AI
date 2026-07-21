// JAVA Programming Assignment - 2
// (Submitted by Chaitanya Jindal)

// Q1. Write a Java class Car with the following attributes: make, model, year, and color.
// · Implement a constructor that initializes these attributes when an object of the Car class is created.
// · Write a main method to create an instance of Car and display its attributes.
// · Enhance the Car class from the previous question by adding a parameterized constructor that takes values for make, model, year, and color as arguments.
// · Demonstrate the use of this constructor in the main method

package Assignment2;

public class Car {
    String make;
    String model;
    int year;
    String color;

    // Parameterized constructor - initializes all attributes
    Car(String make, String model, int year, String color) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
    }

    void display() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Color: " + color);
    }

    public static void main(String[] args) {
        // Creating an object using the parameterized constructor
        Car car1 = new Car("Toyota", "Corolla", 2022, "White");
        car1.display();

        System.out.println();

        Car car2 = new Car("Honda", "Civic", 2023, "Black");
        car2.display();
    }
}
