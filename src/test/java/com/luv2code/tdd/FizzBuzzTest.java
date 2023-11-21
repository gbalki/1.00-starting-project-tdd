package com.luv2code.tdd;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.fail;

@DisplayNameGeneration(DisplayNameGenerator.Simple.class)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class FizzBuzzTest {

    //If number is divisible by 3 print fizz
    //If number is divisible by 5 print buzz
    //If number is divisible by 3 and 5 print fizzbuzz
    //If number is not divisible by 3 or 5 then print the number

    @Test
    @Order(1)
    void testForDivisibleByThree() {
        String expected = "Fizz";

        assertEquals(expected, FizzBuzz.compute(3), "Should Return Fizz");
    }

    @Test
    @Order(2)
    void testForDivisibleByFive() {
        String expected = "Buzz";

        assertEquals(expected, FizzBuzz.compute(5), "Should Return Buzz");
    }

    @Test
    @Order(3)
    void testForDivisibleByThreeAndFive() {
        String expected = "FizzBuzz";

        assertEquals(expected, FizzBuzz.compute(15), "Should Return FizzBuzz");
    }

    @Test
    @Order(4)
    void testForNotDivisibleThreeOrFive() {
        String expected = "1";

        assertEquals(expected, FizzBuzz.compute(1), "Should Return 1");
    }

    @ParameterizedTest(name = "value={0},expected={1}")
    @CsvFileSource(resources = "/small-test-data.csv")
    @Order(5)
    void testForDataFile(int value, String expected) {
        assertEquals(expected, FizzBuzz.compute(value));

    }

    @ParameterizedTest(name = "value={0},expected={1}")
    @CsvFileSource(resources = "/medium-test-data.csv")
    @Order(6)
    void testForMediumDataFile(int value, String expected) {
        assertEquals(expected, FizzBuzz.compute(value));

    }

    @ParameterizedTest(name = "value={0} ,expected{1}")
    @CsvFileSource(resources = "/large-test-data.csv")
    @Order(7)
    void testForLargeDataFile(int value, String expected){
        assertEquals(expected,FizzBuzz.compute(value));

    }
}
