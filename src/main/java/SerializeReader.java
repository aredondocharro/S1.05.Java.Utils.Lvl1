
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class SerializeReader {

    public static void ReadSerializeCoin(String path) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path))) {
            Coin coin = (Coin) ois.readObject();
            System.out.println("Object loaded: " + coin);
        } catch (
                Exception e) {
            e.printStackTrace();
        }
    }

}
