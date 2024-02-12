import java.io.File;
import java.util.Scanner;

public class FileNotFound {
    public static void main(String[] args) {
        try {
            File myFile = new File("test.txt");
            Scanner myReader = new Scanner(myFile);
        } catch (Exception e) {
            System.out.println("An error occurred."+e);

        }
    }
}