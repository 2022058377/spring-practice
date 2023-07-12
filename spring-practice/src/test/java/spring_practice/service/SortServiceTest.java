package spring_practice.service;

import spring_practice.logic.JavaSort;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SortServiceTest {

    private SortService sut = new SortService(new JavaSort<>());

    @Test
    void test() {
        List<String> actual = sut.doSort(List.of("3", "2", "1"));

        assertEquals(List.of("1" ,"2", "3"), actual);
    }
}