package io.accelerate.solutions.CHK;

import java.util.HashMap;
import io.accelerate.solutions.CHK.Product;
import io.accelerate.solutions.CHK.ProductCatalog;

public class CheckoutSolution {

    ProductCatalog productCatalog;

    public Integer checkout(String skus) {
        if (skus == "")
            return 0;

        if (!skus.matches("[A-Z]+"))
            return -1;

        productCatalog = new ProductCatalog();
        int currentBasketValue = 0;

        for (char item : skus.toCharArray()) {
            productCatalog.getProduct(item).amount++;
        }

        for (Product product : productCatalog.getProductCatalogMap().values()) {
            currentBasketValue += (product.amount * product.price);
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

        return (currentBasketValue - applyAllFreeDeals() - applyAllBulkDeals());
    }

    public int applyAllFreeDeals() {
        int discountValue = 0;
        discountValue += applySameProdFreeDeal(productCatalog.getProduct('U'), 3);
        discountValue += applyFreeDeal(productCatalog.getProduct('R'), productCatalog.getProduct('Q'), 4);
        discountValue += applyFreeDeal(productCatalog.getProduct('N'), productCatalog.getProduct('M'), 3);
        discountValue += applySameProdFreeDeal(productCatalog.getProduct('F'), 2);
        discountValue += applyFreeDeal(productCatalog.getProduct('E'), productCatalog.getProduct('B'), 2);

        System.out.println(discountValue);
        return discountValue;
    }

    public int applyAllBulkDeals() {
        int discountValue = 0;

        discountValue += applyBulkDeal(productCatalog.getProduct('A'), 5, 50);
        discountValue += applyBulkDeal(productCatalog.getProduct('A'), 3, 20);

        discountValue += applyBulkDeal(productCatalog.getProduct('B'), 2, 15);

        discountValue += applyBulkDeal(productCatalog.getProduct('H'), 10, 20);
        discountValue += applyBulkDeal(productCatalog.getProduct('H'), 5, 5);

        discountValue += applyBulkDeal(productCatalog.getProduct('K'), 2, 10);

        discountValue += applyBulkDeal(productCatalog.getProduct('P'), 5, 50);

        discountValue += applyBulkDeal(productCatalog.getProduct('Q'), 3, 10);

        discountValue += applyBulkDeal(productCatalog.getProduct('V'), 3, 20);
        discountValue += applyBulkDeal(productCatalog.getProduct('V'), 2, 10);

        System.out.println(discountValue);
        return discountValue;
    }

    public int applyFreeDeal(Product mainProduct, Product dealProduct, int mainProductAmount) {
        int valuePrice = (mainProduct.getAmount() / mainProductAmount) * dealProduct.getPrice();
        dealProduct.setAmount(dealProduct.getAmount() - mainProduct.getAmount() / mainProductAmount);
        return valuePrice;
    }

    public int applySameProdFreeDeal(Product mainProduct, int mainProductAmount) {
        int valuePrice = (mainProduct.getAmount() / (mainProductAmount + 1)) * mainProduct.getPrice();
        mainProduct.setAmount(mainProduct.getAmount() / mainProductAmount);
        return valuePrice;
    }

    public int applyBulkDeal(Product mainProduct, int mainProductAmount, int priceDiscount) {
        int dealValue = (mainProduct.getAmount() / mainProductAmount) * priceDiscount;
        mainProduct.setAmount(mainProduct.getAmount() % mainProductAmount);
        return dealValue;
    }

}




