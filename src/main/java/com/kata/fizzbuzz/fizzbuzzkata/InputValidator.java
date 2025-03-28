package com.kata.fizzbuzz.fizzbuzzkata;

public interface InputValidator {

    default void validate(int number) {
        if (number < 0 || number > 100) {
            throw new NonValidNumber("Non compliant number : ", number);
        }
    }
}
