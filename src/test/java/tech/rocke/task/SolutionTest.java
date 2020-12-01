package tech.rocke.task;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void compressString() {
        assertEquals("E2A1D5F3V4B13C1", Solution.compressString("EEADDDDDFFFVVVVBBBBBBBBBBBBBC"));
        assertEquals("R10", Solution.compressString("RRRRRRRRRR"));
        assertEquals("", Solution.compressString(""));
        assertNull(Solution.compressString(null));
        assertEquals("R2D3R1", Solution.compressString("RRDDDR"));
        assertEquals("A1", Solution.compressString("A"));
    }

    @Test
    void isPalindrome() {
        assertEquals(true, Solution.isPalindrome("tenet"));
        assertEquals(false, Solution.isPalindrome("Tenet"));
        assertEquals(true, Solution.isPalindrome("a"));
        assertEquals(false, Solution.isPalindrome("hello"));
        assertEquals(true, Solution.isPalindrome("11111"));
        assertEquals(false, Solution.isPalindrome(null));
        assertEquals(true, Solution.isPalindrome(""));
    }
}