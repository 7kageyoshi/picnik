// Класс для поиска самого длинного слова в файле
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LongestWord {
    public String findLongestWord(String[] content) {
        String longestWord = "";
        for (String line : content) {
            String[] words = line.split("\\s+");
            for (String word : words) {
                if (word.length() > longestWord.length()) {
                    longestWord = word;
                }
            }
        }
        return longestWord;
    }
}
