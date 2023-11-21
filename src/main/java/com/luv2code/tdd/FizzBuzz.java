package com.luv2code.tdd;

public class FizzBuzz {
    public static String compute(int i) {
        StringBuilder result = new StringBuilder();
        if (i % 3 == 0) {
            result.append("Fizz");
        }
        if (i % 5 == 0) {
            result.append("Buzz");
        }
        if (result.isEmpty()) {
            result.append(i);
        }
        return result.toString();
    }
   /* public static String compute(int i) {
        if ((i % 3 == 0) && (i % 5 == 0)) {
            return "FizzBuzz";
        } else if (i % 3 == 0) {
            return "Fizz";
        } else if (i % 5 == 0) {
            return "Buzz";
        }
        else {
            return Integer.toString(i);
        }
    }*/
}
