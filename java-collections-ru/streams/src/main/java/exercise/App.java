package exercise;

import java.util.List;
import java.util.Arrays;

// BEGIN
class App {

    private static final List<String> FREE_DOMAIN = Arrays.asList(
            "gmail.com", "yandex.ru", "hotmail.com"
    );
    public static long getCountOfFreeEmails(List<String> emails) {

        return emails
                .stream()
                .map(name -> name.split("@")[1])
                .filter(FREE_DOMAIN::contains)
                .count();
    }
}
// END
