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
        catalogueValues.put('D', 40);

        int aCounter = 0;
        int bCounter = 0;
        int eCounter = 0;
        int currentBasketValue = 0;

        for (char item : skus.toCharArray()) {
            if (item == 'A')
                aCounter++;
            if (item == 'B')
                bCounter++;

            currentBasketValue += catalogueValues.get(item);
        }

        if (bCounter > 0) bCounter -= (eCounter / 2);
        
        currentBasketValue -= (aCounter / 5) * 50 + (aCounter / 2) * 15;

        currentBasketValue -= bCounter / 2 * 15;
        return currentBasketValue;
    }

}
