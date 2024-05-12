// Класс для вычисления частоты слов в файле
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class WordFrequency {
    public Map<String, Integer> calculateWordFrequency(String[] content) {
        Map<String, Integer> wordFrequencyMap = new HashMap<>();
        for (String line : content) {
            String[] words = line.split("\\s+");
            for (String word : words) {
                wordFrequencyMap.put(word, wordFrequencyMap.getOrDefault(word, 0) + 1);
            }
        }
        return wordFrequencyMap;
    }
}

