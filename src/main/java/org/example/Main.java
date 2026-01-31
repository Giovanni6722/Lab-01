package org.example;

public class Main
{
    public static void main(String[] args)
    {
        Vehicle v = new Vehicle(2, "Blue", 1.2f, "Gasoline");
        System.out.println("Vehicle:");
        System.out.println("Wheels: " + v.getNumberOfWheels());
        System.out.println("Color: " + v.getColor());
        System.out.println("Engine: " + v.getEngineSize());
        System.out.println("Fuel: " + v.getFuelType());
        System.out.println();

        Car c = new Car(4, "Red", 2.5f, "Gasoline", "Toyota");
        System.out.println("Car:");
        c.honk();
        c.displayInfo();

        c.setColor("Black");
        System.out.println("\nAfter repaint:");
        c.displayInfo();
    }
}