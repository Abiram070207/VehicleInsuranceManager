package network;
import java.net.*;
import java.io.*;
public class InsuranceClient {
    public static void sendHello() {
        try {
            Socket client = new Socket("localhost", 5000);
            PrintWriter out = new PrintWriter(client.getOutputStream(), true);
            out.println("Hello from Client!");
            client.close();
        } catch (Exception e) {
            System.out.println("[Client] Error: " + e.getMessage());
        }
    }
}
