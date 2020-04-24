import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Pepega {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner in = new Scanner(new File("Pepega2.txt"));

        while(in.hasNextLine()) {
            System.out.println(in.nextLine());
        }
        in.close();
    }
}
