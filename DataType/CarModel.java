A car manufacturing company stores the model name of a car using an
instance variable. However, a local variable with the same name exists 
inside a method. You need to use the this keyword to correctly access the
instance variable.

Requirements:
- Create a class Car with an instance variable String model = "Sedan".
- Implement a method changeModel(String model) with a local variable of the same name.
- Inside the method, assign this.model = model to update the instance variable.
- Create a Car object, call changeModel("SUV"), and print the updated model.
Examples
Output

Car Model: Sedan
Updated Car Model: SUV
  Solution-:
  import java.util*;
  class Car {
    String model = "Sedan";

    void changeModel(String model) {
        this.model = model;
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car();

        System.out.println("Car Model: " + car.model);

        car.changeModel("SUV");

        System.out.println("Updated Car Model: " + car.model);
    }
}
