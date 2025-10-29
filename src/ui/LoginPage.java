package ui;
import javax.swing.*;
public class LoginPage extends JFrame {
    public LoginPage() {
        setTitle("Vehicle Insurance Login");
        setSize(420, 220);
        setLayout(null);
        JLabel title = new JLabel("Welcome to Vehicle Insurance Manager", SwingConstants.CENTER);
        title.setBounds(20, 40, 380, 30);
        add(title);
        JButton next = new JButton("Go to Dashboard");
        next.setBounds(130, 100, 150, 30);
        next.addActionListener(e -> new Dashboard());
        add(next);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
}
