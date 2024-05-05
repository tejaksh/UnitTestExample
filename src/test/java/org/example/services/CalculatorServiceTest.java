package org.example.services;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.BeforeAll;

public class CalculatorServiceTest {

    @BeforeAll //before all test cases
    public static void init(){
        System.out.println("Before all test cases");
        System.out.println("Test cases started" );
    }

    @Test
    public void addTwoNumbersTest(){
        int result = CalculatorService.addTwoNumbers(12,45);
        int expected = 57;
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void sumAnyNumberTest(){
        int result = CalculatorService.sumAnyNumbers(10,20,30,40,50);
        int expected = 150;
        Assertions.assertEquals(expected, result);

    }

    @AfterAll //after all test cases
    public static void cleanup(){
        System.out.println("After all test cases");
        System.out.println("Test cases ended");
    }
}