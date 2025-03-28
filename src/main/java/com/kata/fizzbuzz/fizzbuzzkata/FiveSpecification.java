package com.kata.fizzbuzz.fizzbuzzkata;

import java.util.Optional;

public class FiveSpecification implements Specification<Integer> {

    @Override
    public boolean isSatisfiedBy(Integer candidate) {
        return Optional
                .ofNullable(candidate)
                .filter(c -> c % 5 == 0)
                .isPresent();
    }
}
