import core.*;
import ui.*;
import threads.*;
import utils.*;
import network.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Start server (network demo)
        InsuranceServer.startServer();
        // Create sample data
        Vehicle car = new Car("TN09AB1234", "Abiram", "Hyundai i20", 5);
        car.displayDetails();
        InsurancePolicy policy = new ComprehensivePolicy("P001", car);
        System.out.println("Calculated Premium: " + policy.calculatePremium());
        // Threaded calculation
        new PremiumCalculatorThread(policy).start();
        // Save to file
        try {
            FileHandler.saveData("policies.txt", policy.toString());
            System.out.println("Policy saved to data/policies.txt");
        } catch (Exception e) {
            e.printStackTrace();
        }
        // Generic repo
        GenericRepository<InsurancePolicy> repo = new GenericRepository<>();
        repo.add(policy);
        System.out.println("Repo contains: " + repo.size() + " policies.");
        // Launch GUI
        javax.swing.SwingUtilities.invokeLater(() -> new LoginPage());
        // Client sends hello
        new Thread(() -> {
            try { Thread.sleep(1000); } catch (InterruptedException e) {}
            InsuranceClient.sendHello();
        }).start();
    }
}
