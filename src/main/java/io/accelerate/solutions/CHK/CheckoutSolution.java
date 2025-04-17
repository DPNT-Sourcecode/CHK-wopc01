package io.accelerate.solutions.CHK;

import java.util.HashMap;

public class CheckoutSolution {

    HashMap<Character, Integer> catalogueValues;

    public Integer checkout(String skus) {
        if (skus == "")
            return 0;

        if (!skus.matches("[A-Z]+"))
            return -1;

        catalogueValues = new HashMap<>();
        catalogueValues.put('A', 50);
        catalogueValues.put('B', 30);
        catalogueValues.put('C', 20);
        catalogueValues.put('D', 15);

        int aCounter = 0;
        int bCounter = 0;
        int currentBasketValue = 0;

        for (char item : skus.toCharArray()) {
            if (item == 'A')
                aCounter++;
            if (item == 'B')
                bCounter++;

            currentBasketValue += catalogueValues.get(item);
        }

        currentBasketValue -= (aCounter / 3) * 20 + (bCounter / 2) * 15;
        return currentBasketValue;
    }

}





