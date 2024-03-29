package Learning_Exceptions;

//Код с использованием исключений

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionExample18 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("C:\\Users\\Username\\Desktop\\test.txt"));

            String firstString = reader.readLine();
            System.out.println(firstString);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            System.out.println("А вот и блок finally!");
            if (reader != null) {
                reader.close();
            }
        }
    }
}
