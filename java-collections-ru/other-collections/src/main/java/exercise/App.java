package exercise;

import java.util.*;
import java.util.stream.Collectors;

// BEGIN
class App {
    public static Map<String, String> genDiff(Map<String, Object> data1, Map<String,Object> data2) {
        Map<String, String> result;

        result = data1.entrySet().stream()
                .filter(e -> !data2.containsKey(e.getKey()))
                .collect(Collectors.toMap(Map.Entry::getKey, e -> "deleted"));

        result.putAll(data2.entrySet().stream()
                .filter(e -> !data1.containsKey(e.getKey()))
                .collect(Collectors.toMap(Map.Entry::getKey, e -> "added")));

        result.putAll(data1.entrySet().stream()
                .filter(e -> data2.containsKey(e.getKey()))
                .filter(e -> data2.get(e.getKey()).equals(e.getValue()))
                .collect(Collectors.toMap(Map.Entry::getKey, e -> "unchanged")));

        result.putAll(data1.entrySet().stream()
                .filter(e -> data2.containsKey(e.getKey()))
                .filter(e -> !data2.get(e.getKey()).equals(e.getValue()))
                .collect(Collectors.toMap(Map.Entry::getKey, e -> "changed")));

        return result;
    }
}
//END
