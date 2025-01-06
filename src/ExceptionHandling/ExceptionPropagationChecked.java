package ExceptionHandling;
// Checked propagation are not propagate in method calling chain
// we need to use throws keyword to make them to propagate in method calling chain

import java.io.IOException;

class Vehicle {
    static void start() throws IOException {
        int max = 100;
        int avgSpeed = 50;
        throw new IOException("Checked Exception");
    }
}

class Car extends Vehicle{
    static void start() throws IOException{
        Vehicle.start();
        System.out.println("Car");
    }
}

class EvCar extends Car {
    static void start() throws IOException{
        Car.start();
        System.out.println("EvCar");
    }
}


public class ExceptionPropagationChecked {
    public static void main(String[] args)  {
        try {
            EvCar.start();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
