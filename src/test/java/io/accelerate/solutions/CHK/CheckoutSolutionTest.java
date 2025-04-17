package io.accelerate.solutions.CHK;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class CheckoutSolutionTest {

    private CheckoutSolution check;

    @BeforeEach
    public void setUp() {
        check = new CheckoutSolution();
    }

    @Test
    public void checkoutNormal() {
        assertEquals(145, check.checkout("AABB"));
        assertEquals(160, check.checkout("EEEE"));
        assertEquals(160, check.checkout("EEEEBB"));
        assertEquals(190, check.checkout("EEEEBBB"));
    }

    @Test
    public void checkoutEmpty() {
        assertEquals(0, check.checkout(""));
    }

    @Test
    public void checkoutNotValidString() {
        assertEquals(-1, check.checkout("Aa!213s%^"));
    }

    @Test
    public void checkoutNotValidStringLowerCase() {
        assertEquals(-1, check.checkout("bac"));
    }

    @Test
    public void checkoutNotValidStringFail() {

    }

}




