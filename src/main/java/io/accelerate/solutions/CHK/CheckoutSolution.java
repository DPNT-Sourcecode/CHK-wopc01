package io.accelerate.solutions.CHK;

import java.util.HashMap;
import io.accelerate.solutions.CHK.Product;
import io.accelerate.solutions.CHK.ProductCatalog;

public class CheckoutSolution {

    ProductCatalog productCatalog = new ProductCatalog();

    public Integer checkout(String skus) {
        if (skus == "")
            return 0;

        if (!skus.matches("[A-Z]+"))
            return -1;
        int currentBasketValue = 0;

        for (char item : skus.toCharArray()) {
            productCatalog.getProduct(item).amount++;
        }

        // // E discount
        // currentBasketValue -= Math.min((eCounter / 2), bCounter) * 30;
        // bCounter -= eCounter / 2;

        // // A discount
        // currentBasketValue -= (aCounter / 5) * 50;
        // currentBasketValue -= ((aCounter % 5) / 3) * 20;

        // // B discount
        // if (bCounter > 0) {
        // currentBasketValue -= bCounter / 2 * 15;
        // }

        // // F discount
        // currentBasketValue -= (fCounter / 3) * 10;

        return currentBasketValue;
    }

    public void applyFreeDeal(Product mainProduct, Product dealProduct, int dealProductAmount) {
        (mainProduct.getAmount()/dealProductAmount 1) * free

    }

}


