package core;
public abstract class Vehicle {
    protected String regNo;
    protected String ownerName;
    protected String model;
    public Vehicle(String regNo, String ownerName, String model) {
        this.regNo = regNo;
        this.ownerName = ownerName;
        this.model = model;
    }
    public abstract void displayDetails();
}
