package core;
public class Customer {
    private String name, contact;
    public Customer(String name, String contact) {
        this.name = name;
        this.contact = contact;
    }
    public String getName() { return name; }
    public String getContact() { return contact; }
    @Override
    public String toString() { return name + " (" + contact + ")"; }
}
