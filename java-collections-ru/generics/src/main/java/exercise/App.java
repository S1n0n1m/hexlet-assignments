package exercise;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Map.Entry;

// BEGIN
class App {
    public static List<Map<String, String>> findWhere(List<Map<String, String>> books, Map<String, String> whatFind) {
        boolean foundBook;
        List<Map<String, String>> result = new ArrayList<>();
        for (var book : books) {
            foundBook = true;
            for (Map.Entry<String, String> findParam : whatFind.entrySet()) {
                if (!book.get(findParam.getKey()).equals(findParam.getValue())) {
                    foundBook = false;
                }
            }
            if (foundBook) {
                result.add(book);
            }
        }
        return result;
    }
}
//END
