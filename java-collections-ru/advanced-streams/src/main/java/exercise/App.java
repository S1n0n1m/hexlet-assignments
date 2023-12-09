package exercise;

import java.util.stream.Collectors;
import java.util.Arrays;

// BEGIN
class App {
    public static String getForwardedVariables(String str) {
        return Arrays.stream(str.split("\n"))
                .peek(System.out::println)
                .filter(s -> s.startsWith("environment"))
                .map(s -> s.replaceAll("environment=", ""))
                .map(s -> s.replaceAll("\"", ""))
                .map(s -> s.replaceAll(",", " "))
                .map(s -> s.split(" "))
                .flatMap(Arrays::stream)
                .filter(s -> s.startsWith("X_FORWARDED_"))
                .map(s -> s.replaceAll("X_FORWARDED_", ""))
                .map(String::trim)
                .collect(Collectors.joining(","));

    }
}
//END
