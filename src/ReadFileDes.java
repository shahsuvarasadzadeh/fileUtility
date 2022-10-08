import java.io.*;

public class ReadFileDes {
    public static Object readFileDeserialize(String name) {
        Object obj = null;
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(name))) {
            obj = in.readObject();
        } finally {
            return obj;
        }

    }
}
