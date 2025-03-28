package com.kata.fizzbuzz.fizzbuzzkata;

import java.util.Optional;

public class ThreeSpecification implements Specification<Integer> {

    @Override
    public boolean isSatisfiedBy(Integer candidate) {
        return Optional
                .ofNullable(candidate)
                .filter(c -> c % 3 == 0)
                .isPresent();
    }
}
