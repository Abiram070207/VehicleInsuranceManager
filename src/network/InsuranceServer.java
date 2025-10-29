package network;
import java.net.*;
import java.io.*;
public class InsuranceServer {
    public static void startServer() {
        new Thread(() -> {
            try {
                ServerSocket server = new ServerSocket(5000);
                System.out.println("[Server] Running on port 5000...");
                Socket socket = server.accept();
                BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                System.out.println("[Server] Client says: " + in.readLine());
                socket.close();
                server.close();
            } catch (Exception e) {
                System.out.println("[Server] Error: " + e.getMessage());
            }
        }).start();
    }
}
