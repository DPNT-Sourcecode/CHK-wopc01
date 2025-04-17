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
    public void checkoutOfferNormal() {
        assertEquals(150, check.checkout("RRRQ"));
        assertEquals(300, check.checkout("RRRQRQRR"));
    }

    @Test
    public void checkoutOfferA() {
        assertEquals(145, check.checkout("AABB"));
        assertEquals(130, check.checkout("AAA"));
        assertEquals(200, check.checkout("AAAAA"));
    }

    @Test
    public void checkoutOfferB() {
        assertEquals(45, check.checkout("BB"));
        assertEquals(75, check.checkout("BBB"));
        assertEquals(90, check.checkout("BBBB"));
        assertEquals(190, check.checkout("EEEEBBB"));
    }

    @Test
    public void checkoutOfferE() {
        assertEquals(160, check.checkout("EEEE"));
        assertEquals(160, check.checkout("EEEEBB"));
        assertEquals(190, check.checkout("EEEEBBB"));
        assertEquals(440, check.checkout("AAAAAAEEEEBBB"));
    }

    @Test
    public void checkoutOfferF() {
        assertEquals(20, check.checkout("FF"));
        assertEquals(20, check.checkout("FFF"));
        assertEquals(30, check.checkout("FFFF"));
    }

    @Test
    public void checkoutGroupOfferSpecial() {
        //assertEquals(45, check.checkout("XYS"));
        assertEquals(65, check.checkout("ZYSS"));
        assertEquals(90, check.checkout("STXSTX"));
    }

}







