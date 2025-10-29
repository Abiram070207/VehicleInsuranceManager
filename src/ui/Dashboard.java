package ui;
import javax.swing.*;
public class Dashboard extends JFrame {
    public Dashboard() {
        setTitle("Insurance Dashboard");
        setSize(500, 300);
        setLayout(null);
        JLabel lbl = new JLabel("Dashboard Loaded Successfully!", SwingConstants.CENTER);
        lbl.setBounds(20, 40, 450, 30);
        add(lbl);
        setVisible(true);
    }
}
