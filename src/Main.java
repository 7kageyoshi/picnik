import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String[] content = {
                "яблоко апельсин банан арбуз",
                "арбуз арбуз апельсин яблоко",
                "мандарин банан яблоко",
                "томат огурец морковь картофель",
                "огурец томат огурец морковь"
        };

        // Вызываем методы других классов и выводим результаты
        WordCount wordCount = new WordCount();
        int count = wordCount.countWords(content);
        System.out.println("Количество слов в файле: " + count);

        LongestWord longestWord = new LongestWord();
        String longest = longestWord.findLongestWord(content);
        System.out.println("Самое длинное слово в файле: " + longest);

        WordFrequency wordFrequency = new WordFrequency();
        Map<String, Integer> frequencyMap = wordFrequency.calculateWordFrequency(content);
        System.out.println("Частота слов в файле:");
        for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

