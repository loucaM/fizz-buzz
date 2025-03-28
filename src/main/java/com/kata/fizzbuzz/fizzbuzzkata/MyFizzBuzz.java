package com.kata.fizzbuzz.fizzbuzzkata;

public class MyFizzBuzz {

    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";
    private final InputValidator inputValidator ;

    public MyFizzBuzz(InputValidator inputValidator) {
        this.inputValidator = inputValidator;
    }

    public String perform(int number) {

        inputValidator.validate(number);

        return executeFizzBuzz(number) ;
    }

    private String executeFizzBuzz(int number) {
        StringBuilder fizzBuzzStringBuilder = new StringBuilder();

        for (int i = 1; i < number + 1 ; i++) {
            fizzBuzzStringBuilder.append(fizzBuzzAppender(i));
        }

       return fizzBuzzStringBuilder.toString();
    }

    private String fizzBuzzAppender(int i) {
        if (FizzBuzzSpecification.DIVISBLE_BY_THREE_AND_FIVE_SPECIFICAION.get().isSatisfiedBy(i)) {
            return FIZZ + BUZZ;
        }

        if (FizzBuzzSpecification.THREE_SPECIFICATION.get().isSatisfiedBy(i)){
            return FIZZ;
        }

        if (FizzBuzzSpecification.FIVE_SPECIFICATION.get().isSatisfiedBy(i)) {
          return  BUZZ ;
        }

        return String.valueOf(i);

    }
}