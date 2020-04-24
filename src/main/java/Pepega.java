import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pepega {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner in = new Scanner(new File("Pepega2.txt"));
        List<String> pepega2 = new ArrayList<>();

        while(in.hasNextLine()) {
            pepega2.add(in.nextLine());
        }
        for (int i = 0; i < pepega2.size(); i++) {

            System.out.println("word: " + pepega2.get(i));
        }
        in.close();
    }
}
