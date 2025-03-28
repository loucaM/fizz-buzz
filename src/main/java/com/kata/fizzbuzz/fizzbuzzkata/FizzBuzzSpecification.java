package com.kata.fizzbuzz.fizzbuzzkata;

import java.util.function.Supplier;

public enum FizzBuzzSpecification {

    THREE_SPECIFICATION(ThreeSpecification::new),
    FIVE_SPECIFICATION(FiveSpecification::new),
    DIVISBLE_BY_THREE_AND_FIVE_SPECIFICAION(() ->
            new AndSpecification<>(new FiveSpecification(),
            new ThreeSpecification()
            ));

    private final Supplier<Specification<Integer>> constructor;


    FizzBuzzSpecification(Supplier<Specification<Integer>> constructor) {
        this.constructor = constructor;
    }

    public Specification<Integer> get() {
        return constructor.get();
    }
}
