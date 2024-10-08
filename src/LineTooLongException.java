import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LineTooLongException extends RuntimeException {
    public LineTooLongException(String message) {
        super(message);
    }

    public static void processFile(String filePath) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.length() > 1024) {
                    throw new LineTooLongException("Длина строки более 1024 символов");
                }
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        try {
            processFile("example.txt");
        } catch (LineTooLongException e) {
            System.out.println(e.getMessage());

        }
    }
}