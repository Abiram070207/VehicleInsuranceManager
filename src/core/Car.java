package core;
public class Car extends Vehicle {
    private int seatingCapacity;
    public Car(String regNo, String ownerName, String model, int seatingCapacity) {
        super(regNo, ownerName, model);
        this.seatingCapacity = seatingCapacity;
    }
    @Override
    public void displayDetails() {
        System.out.println("Car: " + model + " | Owner: " + ownerName + " | Reg: " + regNo);
    }
}
