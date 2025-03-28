package com.kata.fizzbuzz.fizzbuzzkata;

public class NonValidNumber extends RuntimeException {
    public NonValidNumber(String message, int number) {
        super(message);
    }
}
