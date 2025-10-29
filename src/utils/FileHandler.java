package utils;
import java.io.*;
public class FileHandler {
    public static void saveData(String fileName, String data) throws IOException {
        File dir = new File("data");
        if (!dir.exists()) dir.mkdirs();
        FileWriter fw = new FileWriter(new File(dir, fileName), true);
        fw.write(data + System.lineSeparator());
        fw.close();
    }
}
