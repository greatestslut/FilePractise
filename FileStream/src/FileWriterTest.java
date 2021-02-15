import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

    public static void main(String[] args) {
    }

    public static void writeToFile(String text,String path) {
        File f = new File(path);
        FileWriter fw = null;
        try {
            fw = new FileWriter(f, true);
            fw.write(text);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fw != null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
