import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileAttribute {
    public static void main(String[] args) throws IOException {

        File d = new File("E:\\io\\io1");
        boolean mkdir = d.mkdirs();
        if (mkdir) {
            System.out.println("directory created successfully");
        }


//        File f = new File("hi.txt");
//        if (!f.exists()) {
//            f.createNewFile();
//            System.out.println("create file successfully");
//        }
//
//        File f1 = new File("hello.txt");
//        File f2 = new File("D:/hello.txt");
//        File f3 = new File("D:/", "txtx");
//        File f4 = new File(f3, "txtx.txt");
//        System.out.println(f1.getAbsoluteFile());
//        System.out.println(f1.getPath());
//        System.out.println(f1.getName());
//        System.out.println(f1.getParent());
//        System.out.println(f1.length());
//        System.out.println(new Date(f1.lastModified()));
//
//        System.out.println();
//
//        System.out.println(f2.getAbsoluteFile());
//        System.out.println(f2.getPath());
//        System.out.println(f2.getName());
//        System.out.println(f2.getParent());
//        System.out.println(f2.length());
//        File f = new File("hello.txt");
//        f = new File("hello.tx");
//        f = new File("C:\\temp");
//
//        System.out.println(f.exists());
//        System.out.println(f.isDirectory());
//        System.out.println(f.isFile());
//        System.out.println(f.canRead());
//        System.out.println(f.canWrite());
//        System.out.println(f.isHidden());


    }
}
