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

        int currentBasketValue = 0;

        for (char item : skus.toCharArray()) {
            

        }

        return -1;
    }
}



