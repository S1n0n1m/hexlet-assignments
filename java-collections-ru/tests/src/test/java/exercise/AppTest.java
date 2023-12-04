package exercise;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AppTest {

    List<Integer> numbers;

    @BeforeEach
    void integerList() {
        this.numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    }

    @Test
    void testTake() {
        // BEGIN
        var current = App.take(numbers, 5);
        var expected = List.of(1, 2, 3, 4, 5);
        assertThat(current).isEqualTo(expected);

        var current1 = App.take(numbers, 0);
        var expected1 = List.of();
        assertThat(current1).isEqualTo(expected1);

        var current2 = App.take(numbers, 10);
        var expected2 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        assertThat(current2).isEqualTo(expected2);

        var current3 = App.take(numbers, 3);
        var expected3 = List.of(1, 2, 3);
        assertThat(current3).isEqualTo(expected3);
        // END
    }
}
