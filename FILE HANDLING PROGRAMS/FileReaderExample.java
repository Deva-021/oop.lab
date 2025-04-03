import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {  
    public static void main(String[] args) {
        try (FileReader fileReader = new FileReader("example.txt")) {
            int charRead;
            while ((charRead = fileReader.read()) != -1) {
                System.out.print((char) charRead);
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }
}

