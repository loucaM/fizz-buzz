package com.kata.fizzbuzz.fizzbuzzkata;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("FizzBuzz Generator Tests")
public class MyFizzBuzzTest {

    public static final String FizzBuzzFor100 = "12Fizz4BuzzFizz78FizzBuzz11Fizz1314FizzBuzz1617Fizz19BuzzFizz2223FizzBuzz26Fizz282" +
            "9FizzBuzz3132Fizz34BuzzFizz3738FizzBuzz41Fizz4344FizzBuzz4647Fizz49BuzzFizz5253FizzBuzz56Fizz5" +
            "859FizzBuzz6162Fizz64BuzzFizz6768FizzBuzz71Fizz7374FizzBuzz7677Fizz79BuzzFizz8283FizzBuzz86Fiz" +
            "z8889FizzBuzz9192Fizz94BuzzFizz9798FizzBuzz";

    static InputValidator inputValidator;

    @BeforeAll
    static void before() {
        inputValidator = new FizzBuzzInputValidator();
    }

    @Test
    @DisplayName("Should return Fizz for number 3")
    void shouldReturnFizzAtThree() {
        var fizzBuzz = new MyFizzBuzz(inputValidator);

        Assertions.assertThat(fizzBuzz.perform(3)).isEqualTo("12Fizz");
    }

    @Test
    @DisplayName("Should return Fizz and Buzz up to 5")
    void shouldReturnFizzAndBuzzAtFive() {
        var fizzBuzz = new MyFizzBuzz(inputValidator);

        Assertions.assertThat(fizzBuzz.perform(5)).isEqualTo("12Fizz4Buzz");
    }

    @Test
    @DisplayName("Should generate correct FizzBuzz sequence up to 100")
    void shouldGenerateFizzBuzzUpTo100() {
        var fizzBuzz = new MyFizzBuzz(inputValidator);

        var result = fizzBuzz.perform(100);

        Assertions.assertThat(result)
                .isEqualTo(FizzBuzzFor100);
    }

    @Test
    @DisplayName("Should throw exception for negative number")
    void shouldThrowErrorForNegativeInput() {
        var fizzBuzz = new MyFizzBuzz(inputValidator);

        Assertions.assertThatThrownBy(() -> fizzBuzz.perform(-3))
                .isExactlyInstanceOf(NonValidNumber.class);
    }

    @Test
    @DisplayName("Should throw exception for number greater than 100")
    void shouldThrowErrorForTooLargeInput() {
        var fizzBuzz = new MyFizzBuzz(inputValidator);

        Assertions.assertThatThrownBy(() -> fizzBuzz.perform(675))
                .isExactlyInstanceOf(NonValidNumber.class);
    }

}