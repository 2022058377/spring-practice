package fastcampus.javaoop.logic;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {
    @Test
    void test() {
        BubbleSort<Integer> bubbleSort = new BubbleSort<>();

        List<Integer> actual = bubbleSort.sort(List.of(3,2,4,5,1));

        assertEquals(List.of(1,2,3,4,5), actual);
    }
}