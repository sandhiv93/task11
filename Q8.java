package q8_Q8;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader {
    public static void main(String[] args) {

        String filePath = "sample.txt";

        try {
            File file = new File(filePath);
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: The file does not exist.");
        } catch (Exception e) {
            System.out.println("Error: An unexpected error occurred.");
        }
    }
}