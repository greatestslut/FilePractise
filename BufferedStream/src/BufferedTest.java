import java.io.*;

public class BufferedTest {
    public static void main(String[] args) {
        bufferedTextFile();
    }

    private static void bufferedNonTextFile() {
        //1.file
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            File srcFile = new File("video1.mp4");
            File descFile = new File("video2.mp4");
            //2.1 node stream
            bis = new BufferedInputStream(new FileInputStream(srcFile));
            bos = new BufferedOutputStream(new FileOutputStream(descFile));
            //2.2 process stream
            byte[] buffer = new byte[10];
            int len;
            //3 give a buffer to read and write the generated buffer into the new file
            while ((len = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4 close the resource
            if (bos == null) {
                try {
                    bos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bis == null) {
                try {
                    bis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private static void bufferedTextFile() {
        //1.file
        BufferedReader br = null;
        BufferedWriter bw = null;
        try {
            File srcFile = new File("runoob.txt");
            File descFile = new File("hello89.txt");
            //2.1 node stream
            br = new BufferedReader(new FileReader(srcFile));
            bw = new BufferedWriter(new FileWriter(descFile));
            //2.2 process stream
            char[] buffer = new char[10];
            int len;
            //3 give a buffer to read and write the generated buffer into the new file
            while ((len = br.read(buffer)) != -1) {
                bw.write(buffer);
                bw.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4 close the resource
            if (bw == null) {
                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (br == null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
