package io.accelerate.solutions.CHK;

import java.util.HashMap;

import io.accelerate.runner.SolutionNotImplementedException;

public class CheckoutSolution {

    HashMap<Character, Integer> catalogueValues;

    public Integer checkout(String skus) {
        // Check format of string to check valid
        // Check correct value of basket
        catalogueValues = new HashMap<>();
        catalogueValues.put('A', 50);
        catalogueValues.put('B', 30);
        catalogueValues.put('C', 20);
        catalogueValues.put('D', 15);

        int aCounter = 0;
        int bCounter = 0;
        int currentBasketValue = 0;

        for (char item : skus.toCharArray()) {
            currentBasketValue += catalogueValues.get(item);
        }

        currentBasketValue -= (aCounter / 3) * 20 + (bCounter / 2) * 15;

        return currentBasketValue;
    }

    public static void main(String[] args) {
        System.out.println((4 / 3) * 20 + (0 / 2) * 15);
    }
}
