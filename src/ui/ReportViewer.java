package ui;
import javax.swing.*;
public class ReportViewer extends JFrame {
    public ReportViewer(String report) {
        setTitle("Report Viewer");
        setSize(400, 300);
        JTextArea area = new JTextArea(report);
        add(new JScrollPane(area));
        setVisible(true);
    }
}
