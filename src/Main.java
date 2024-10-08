import java.io.BufferedReader;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {

        String line;

        //Общее количество строк в файле
        int totalLines = 0;

        //Самая длинная строка в файле
        int maxLength = 0;

        //Самая короткая строка в файле
        int minLength = Integer.MAX_VALUE;

        try {

            FileReader fileReader = new FileReader("access.log");

            BufferedReader reader = new BufferedReader(fileReader);

            while ((line = reader.readLine()) != null) {

                totalLines++;

                int length = line.length();

                if (length > maxLength) {
                    maxLength = length;
                }
                if (length < minLength) {
                    minLength = length;
                }

            }
            System.out.println("Общее количество строк в файле: " + totalLines);

            System.out.println("Самая длинная строка в файле: " + maxLength);

            System.out.println("Самая короткая строка в файле: " + minLength);

        } catch (Exception ex) {

            ex.printStackTrace();
        }


    }
}