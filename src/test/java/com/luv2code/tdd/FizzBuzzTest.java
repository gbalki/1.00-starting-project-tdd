package com.luv2code.tdd;

import org.junit.jupiter.api.*;

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
    void testForDivisibleByThree(){
        String expected = "Fizz";

        assertEquals(expected,FizzBuzz.compute(3),"Should Return Fizz");
    }

    @Test
    @Order(2)
    void testForDivisibleByFive(){
        String expected = "Buzz";

        assertEquals(expected,FizzBuzz.compute(5),"Should Return Buzz");
    }
}
