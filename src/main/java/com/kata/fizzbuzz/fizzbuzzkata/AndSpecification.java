package com.kata.fizzbuzz.fizzbuzzkata;

public class AndSpecification<Integer> implements Specification<java.lang.Integer> {

    private final Specification<java.lang.Integer> firstSpecification;
    private final Specification<java.lang.Integer> secondSpecification;

    public AndSpecification(Specification<java.lang.Integer> firstSpecification, Specification<java.lang.Integer> secondSpecification) {
        this.firstSpecification = firstSpecification;
        this.secondSpecification = secondSpecification;
    }

    @Override
    public boolean isSatisfiedBy(java.lang.Integer candidate) {
        return firstSpecification.isSatisfiedBy(candidate) && secondSpecification.isSatisfiedBy(candidate);
    }
}
