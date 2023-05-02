/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.recursiontest;

import org.junit.Test;
import static org.junit.Assert.*;

public class RecursionTestTest {
    
    @Test
    public void testFact() {
        assertEquals(1, RecursionTest.fact(0));
        assertEquals(1, RecursionTest.fact(1));
        assertEquals(2, RecursionTest.fact(2));
        assertEquals(6, RecursionTest.fact(3));
        assertEquals(24, RecursionTest.fact(4));
    }
    
    @Test
    public void testReverseString() {
        assertEquals("", RecursionTest.reverseString(""));
        assertEquals("a", RecursionTest.reverseString("a"));
        assertEquals("cba", RecursionTest.reverseString("abc"));
        assertEquals("54321", RecursionTest.reverseString("12345"));
    }
    
    @Test
    public void testIsPalindrome() {
        assertTrue(RecursionTest.isPalindrome(""));
        assertTrue(RecursionTest.isPalindrome("a"));
        assertTrue(RecursionTest.isPalindrome("aa"));
        assertTrue(RecursionTest.isPalindrome("aba"));
        assertTrue(RecursionTest.isPalindrome("racecar"));
        assertFalse(RecursionTest.isPalindrome("ab"));
        assertFalse(RecursionTest.isPalindrome("abc"));
        assertFalse(RecursionTest.isPalindrome("hello"));
    }
    
    @Test
    public void testSum() {
        assertEquals(0, RecursionTest.sum(0));
        assertEquals(1, RecursionTest.sum(1));
        assertEquals(3, RecursionTest.sum(2));
        assertEquals(6, RecursionTest.sum(3));
        assertEquals(10, RecursionTest.sum(4));
    }
    
}

