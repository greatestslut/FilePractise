import java.io.File;

public class FileCopyTest {
    public static void main(String[] args) {
        String text = FileReaderTest.readFileToRAM("hello1.txt").toString();
        FileWriterTest.writeToFile(text,"hello2.txt");


    }


}
