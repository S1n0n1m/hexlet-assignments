package exercise;

import java.util.HashMap;
import java.util.Map;

// BEGIN
class App {
    public static Map<String, Integer> getWordCount(String sentence) {
        Map<String, Integer> wordCount = new HashMap<>();
        String[] words = sentence.split(" ");

        if (sentence.isEmpty()) return wordCount;

        for (String word: words) {
            int wordsCounts = wordCount.getOrDefault(word, 0);
            wordsCounts++;
            wordCount.put(word, wordsCounts);
        }
        return wordCount;
    }

    public static String toString(Map<String, Integer> wordCount) {
        StringBuilder builder = new StringBuilder();

        builder.append("{");

        if (!wordCount.isEmpty()) {
            for (Map.Entry<String, Integer> wordEntrance : wordCount.entrySet()) {
                builder.append("\n  ")
                        .append(wordEntrance.getKey())
                        .append(": ")
                        .append(wordEntrance.getValue());
            }
            builder.append("\n");
        }
        return builder.append("}").toString();
    }
}
//END
