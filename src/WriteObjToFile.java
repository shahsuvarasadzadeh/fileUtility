import java.io.*;

public class WriteObjToFile {

    public static Void writeObjectToFile(Object object, String name) throws RuntimeException {
        try (FileOutputStream fout = new FileOutputStream(name);
             ObjectOutputStream oos = new ObjectOutputStream(fout);) {
            oos.writeObject(object);
        } catch (Exception e) {
            throw new RuntimeException();
        }
        return null;
    }
}
