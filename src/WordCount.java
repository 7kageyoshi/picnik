// Класс для подсчета количества слов в файле
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordCount {
    public int countWords(String[] content) {
        int wordCount = 0;
        for (String line : content) {
            String[] words = line.split("\\s+");
            wordCount += words.length;
        }
        return wordCount;
    }
}
