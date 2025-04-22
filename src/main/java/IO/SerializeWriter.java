package IO;

import Model.Coin;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializeWriter {

    public static void CoinToSer(Coin coin, String path) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path))) {
            oos.writeObject(coin);
            System.out.println("Object saved on "+path);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
