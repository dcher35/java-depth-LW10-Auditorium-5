package com.edu.chmnu.ki_123.c3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayBinarySearchTest {
    //Тест коли ключ присутній у масиві
    @Test
    public void testKeyPresent() {
        int[] sortedArray = {7, 9, 13, 15, 30, 57, 101};
        int key = 15;
        int expectedIndex = 3;

        assertEquals(expectedIndex, ArrayBinarySearch.binarySearch(sortedArray, key));
    }

    //Тест коли ключ відсутній у масиві
    @Test
    public void testKeyNoPresent() {
        int[] sortedArray = {7, 9, 13, 15, 30, 57, 101};
        int key = 50;
        int expectedIndex = -1;

        assertEquals(expectedIndex, ArrayBinarySearch.binarySearch(sortedArray, key));
    }

    //Тест на перевірку бінарного пошуку в порожньому масиві
    @Test
    public void testEmptyArray() {
        int[] emptyArray = {};
        int key = 15;
        int expectedIndex = -1;

        assertEquals(expectedIndex, ArrayBinarySearch.binarySearch(emptyArray, key));
    }
}