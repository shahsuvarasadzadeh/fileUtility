import java.io.*;

public class ReadFile {
    public static String read(String fileName) throws Exception {

        try (InputStream in = new FileInputStream(fileName);
             InputStreamReader r = new InputStreamReader(in);
             BufferedReader reader = new BufferedReader(r);) {
            String line = null;
            String result = "";
            while ((line = reader.readLine()) != null) {

                result += line + "\n";
            }
            return result;
        }
    }
}
