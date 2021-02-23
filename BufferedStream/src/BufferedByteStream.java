import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class BufferedByteStream {
    public static void main(String[] args) {
        HashMap<Character, Integer> map = new HashMap<>();
        FileReader fr = null;
        try {
            fr = new FileReader("hello89.txt");
            int c = 0;
            while ((c = fr.read()) != -1) {
                char ch = (char) c;
                if (ch == ' ') {
                    continue;
                }
                if (map.containsKey(ch)) {
                    map.put(ch, map.get(ch) + 1);
                } else {
                    map.put(ch, 1);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fr != null) {
                    fr.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println(map);
    }

}
