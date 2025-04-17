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

    public void applyAllFreeDeals() {
        applyFreeDeal(productCatalog.getProduct('U'), productCatalog.getProduct('U'), 3);
        applyFreeDeal(productCatalog.getProduct('R'), productCatalog.getProduct('Q'), 1);
        applyFreeDeal(productCatalog.getProduct('U'), productCatalog.getProduct('U'), 3);
        applyFreeDeal(productCatalog.getProduct('U'), productCatalog.getProduct('U'), 3);
        applyFreeDeal(productCatalog.getProduct('U'), productCatalog.getProduct('U'), 3);
        

    }

    public int applyAllBulkDeals() {

    }

    public void applyFreeDeal(Product mainProduct, Product dealProduct, int mainProductAmount) {
        mainProduct.amount -= (mainProduct.getAmount() / mainProductAmount + 1) * dealProduct.getPrice();
    }

    public int applyBulkDeal(Product mainProduct, int mainProductAmount, int priceDiscount) {
        return (mainProduct.getAmount() / mainProductAmount) * priceDiscount;
    }

}




