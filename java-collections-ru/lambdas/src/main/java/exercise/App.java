package exercise;

import java.util.Arrays;

// BEGIN
class App {
    public static String[] duplicates(String[] items) {
        return Arrays.stream(items)
                .flatMap(item -> Arrays.stream(new String[] {item, item}))
                .toArray(String[]::new);
    }
    public static String[][] enlargeArrayImage(String[][] image) {
        String[][] horizontalStretched = Arrays.stream(image)
                .map(App::duplicates)
                .toArray(String[][]::new);

        return Arrays.stream(horizontalStretched)
                .flatMap(item -> Arrays.stream(new String[][] {item, item}))
                .toArray(String[][]::new);

    }
}
// END
