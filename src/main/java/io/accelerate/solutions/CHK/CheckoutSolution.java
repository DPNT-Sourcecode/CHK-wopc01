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

        return (currentBasketValue - applyAllFreeDeals() - applyAllBulkDeals());
    }

    public int applyAllFreeDeals() {
        int discountValue = 0;
        discountValue += applySameProdFreeDeal(productCatalog.getProduct('U'), 3);
        discountValue += applyFreeDeal(productCatalog.getProduct('R'), productCatalog.getProduct('Q'), 3);
        discountValue += applyFreeDeal(productCatalog.getProduct('N'), productCatalog.getProduct('M'), 3);
        discountValue += applySameProdFreeDeal(productCatalog.getProduct('F'), 2);
        discountValue += applyFreeDeal(productCatalog.getProduct('E'), productCatalog.getProduct('B'), 2);

        return discountValue;
    }

    public int applyAllBulkDeals() {
        int discountValue = 0;

        discountValue += applyBulkDeal(productCatalog.getProduct('A'), 5, 50);
        discountValue += applyBulkDeal(productCatalog.getProduct('A'), 3, 20);

        discountValue += applyBulkDeal(productCatalog.getProduct('B'), 2, 15);

        discountValue += applyBulkDeal(productCatalog.getProduct('H'), 10, 20);
        discountValue += applyBulkDeal(productCatalog.getProduct('H'), 5, 5);

        discountValue += applyBulkDeal(productCatalog.getProduct('K'), 2, 20);

        discountValue += applyBulkDeal(productCatalog.getProduct('P'), 5, 50);

        discountValue += applyBulkDeal(productCatalog.getProduct('Q'), 3, 10);

        discountValue += applyBulkDeal(productCatalog.getProduct('V'), 3, 20);
        discountValue += applyBulkDeal(productCatalog.getProduct('V'), 2, 10);
        discountValue += applyBulkGroupDeal(3);

        return discountValue;
    }

    public int applyFreeDeal(Product mainProduct, Product dealProduct, int mainProductAmount) {
        int valuePrice = Math.min((mainProduct.getAmount() / mainProductAmount), dealProduct.getAmount())
                * dealProduct.getPrice();
        dealProduct.setAmount(Math.max(dealProduct.getAmount() - (mainProduct.getAmount() / mainProductAmount), 0));
        return valuePrice;
    }

    public int applySameProdFreeDeal(Product mainProduct, int mainProductAmount) {
        return (mainProduct.getAmount() / (mainProductAmount + 1)) * mainProduct.getPrice();
    }

    public int applyBulkDeal(Product mainProduct, int mainProductAmount, int priceDiscount) {
        int dealValue = (mainProduct.getAmount() / mainProductAmount) * priceDiscount;
        mainProduct.setAmount(mainProduct.getAmount() % mainProductAmount);
        return dealValue;
    }

    public int applyBulkGroupDeal(int mainProductsDealAmount) {
        Product[] mainProducts = new Product[] { productCatalog.getProduct('Z'), productCatalog.getProduct('T'),
                productCatalog.getProduct('S'), productCatalog.getProduct('Y'), productCatalog.getProduct('X') };
        int totalAmount = 0;
        int totalPriceDiscount = 0;

        for (Product product : mainProducts) {
            totalAmount += product.getAmount();
        }

        int totalPriceItems = (totalAmount / mainProductsDealAmount) * mainProductsDealAmount;
        for (Product product : mainProducts) {
            if (totalPriceItems <= 0)
                break;
            if (totalPriceItems - product.getAmount() >= 0) {
                totalPriceDiscount += product.getAmount() * product.getPrice();
                totalPriceItems -= product.getAmount();
            } else {
                totalPriceDiscount += product.getAmount() * product.getPrice();
                totalPriceItems -= product.getAmount() - 1;
            }
        }

        System.out.println((totalAmount / mainProductsDealAmount));
        int dealValue = (totalAmount / mainProductsDealAmount)
                * (totalPriceDiscount - ((totalAmount / mainProductsDealAmount) * 45));
        
        return dealValue;
    }

}







