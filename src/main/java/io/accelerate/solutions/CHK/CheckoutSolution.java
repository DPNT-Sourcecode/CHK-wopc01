package io.accelerate.solutions.CHK;

import java.util.HashMap;
import io.accelerate.solutions.CHK.Product;

public class CheckoutSolution {

    HashMap<Character, Product> catalogueValues = new HashMap<>();
    
    catalogueValues.put('A', new Product('A',50, 0));
    catalogueValues.put('B', new Product('B',30, 0));
    catalogueValues.put('C', new Product('C',20, 0));
    catalogueValues.put('D', new Product('D',15, 0));
    catalogueValues.put('E', new Product('E',40, 0));
    catalogueValues.put('F', new Product('F',10, 0));
    catalogueValues.put('G', new Product('G',20, 0));
    catalogueValues.put('H', new Product('H',10, 0));
    catalogueValues.put('I', new Product('I',35, 0));
    catalogueValues.put('J', new Product('J',60, 0));
    catalogueValues.put('K', new Product('K',80, 0));
    catalogueValues.put('L', new Product('L',90, 0));
    catalogueValues.put('M', new Product('M',15, 0));
    catalogueValues.put('N', new Product('N',40, 0));
    catalogueValues.put('O', new Product('O',10, 0));
    catalogueValues.put('P', new Product('P',50, 0));
    catalogueValues.put('Q', new Product('Q',30, 0));
    catalogueValues.put('R', new Product('R',50, 0));
    catalogueValues.put('S', new Product('S',30, 0));
    catalogueValues.put('T', new Product('T',20, 0));
    catalogueValues.put('U', new Product('U',40, 0));
    catalogueValues.put('V', new Product('V',50, 0));
    catalogueValues.put('W', new Product('W',20, 0));
    catalogueValues.put('X', new Product('X',90, 0));
    catalogueValues.put('Y', new Product('Y',10, 0));
    catalogueValues.put('Z', new Product('Z',50, 0));


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




