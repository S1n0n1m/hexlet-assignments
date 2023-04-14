package exercise;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

// BEGIN
class App {
    public static boolean scrabble(String symbol, String word) {
        if (symbol.length() >= word.length()) {

            List<String> symbolList = new ArrayList<>(Arrays.asList(symbol.toLowerCase().split("")));
            List<String> wordList = new ArrayList<>(Arrays.asList(word.toLowerCase().split("")));

            int counter = 0;

            List<Integer> containList = new ArrayList<>();

            for (int i = 0; i < word.length(); i++) {
                for (int j = 0; j < symbol.length(); j++) {
                    if (Objects.equals(symbolList.get(j), wordList.get(i)) && !containList.contains(j)) {
                        counter++;
                        containList.add(j);
                        break;
                    }
                }
            }
            return counter == word.length();
        }
        return false;
    }
}
