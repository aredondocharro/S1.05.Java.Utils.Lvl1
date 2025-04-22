import java.io.BufferedReader;
import java.io.IOException;

public class FileReader {
    public static void ReadFile(String path) {
        try (BufferedReader br = new BufferedReader(new java.io.FileReader(path))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
