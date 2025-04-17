package io.accelerate.solutions.CHK;

import java.util.HashMap;
import io.accelerate.solutions.CHK.Product;
import io.accelerate.solutions.CHK.Product;

public class CheckoutSolution {



    public Integer checkout(String skus) {
        if (skus == "")
            return 0;

        if (!skus.matches("[A-Z]+"))
            return -1;



        int aCounter = 0;
        int bCounter = 0;
        int eCounter = 0;
        int fCounter = 0;
        int currentBasketValue = 0;

        for (char item : skus.toCharArray()) {
            if (item == 'A')
                aCounter++;
            if (item == 'B')
                bCounter++;
            if (item == 'E')
                eCounter++;
            if (item == 'F')
                fCounter++;

            currentBasketValue += catalogueValues.get(item);
        }

        // E discount
        currentBasketValue -= Math.min((eCounter / 2), bCounter) * 30;
        bCounter -= eCounter / 2;

        // A discount
        currentBasketValue -= (aCounter / 5) * 50;
        currentBasketValue -= ((aCounter % 5) / 3) * 20;

        // B discount
        if (bCounter > 0) {
            currentBasketValue -= bCounter / 2 * 15;
        }

        // F discount
        currentBasketValue -= (fCounter / 3) * 10;

        return currentBasketValue;
    }

}
