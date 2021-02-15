import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {

    public static void main(String[] args) {
    }

    public static StringBuilder readFileToRAM(String path) {
        File f = new File(path);
        FileReader fr = null;
        StringBuilder text = new StringBuilder();
        try {
            fr = new FileReader(f);
            char[] cbuf = new char[3];
            int len;
            while ((len = fr.read(cbuf)) != -1) {
                if (len <= cbuf.length) {
                    for (int i = 0; i < len; i++) {
                        text.append(cbuf[i]);
                    }
                } else {
                    text.append(cbuf);
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return text;
    }


}


