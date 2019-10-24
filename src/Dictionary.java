import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Dictionary {
    Set<String> words = new HashSet<>();
    File file = new File("dictionary.txt");
    public Dictionary() throws FileNotFoundException {
        Scanner sc = new Scanner(file);
        while (sc.hasNextLine())
        {
            words.add(sc.nextLine());
        }
    }
    public  boolean hasWord(String word){
        return words.contains(word);
    }
}
