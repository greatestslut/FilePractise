import java.io.*;

public class FileOutputStreamTest {

    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream fi = null;
        FileOutputStream fo = null;
        try {
            File f1 = new File("hello1.txt");
            File f2 = new File("video.tt");

            fi = new FileInputStream(f1);
            fo = new FileOutputStream(f2);

            byte[] buffer = new byte[5];
            int len;
            while ((len = fi.read(buffer)) != -1) {
                fo.write(buffer,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fo == null) {
                    fi.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (fo == null) {
                    fo.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }




    }
}
