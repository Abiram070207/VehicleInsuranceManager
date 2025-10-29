package utils;
import java.io.*;
public class LoggerUtility {
    public static void log(String msg) {
        try {
            FileHandler.saveData("app.log", msg);
        } catch (Exception e) { e.printStackTrace(); }
    }
}
