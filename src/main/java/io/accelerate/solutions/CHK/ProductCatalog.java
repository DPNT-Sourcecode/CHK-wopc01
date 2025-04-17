package io.accelerate.solutions.CHK;

import java.util.HashMap;

public class ProductCatalog {
    HashMap<Character, Product> productCatalogMap;

    public ProductCatalog() {
        productCatalogMap = new HashMap<Character, Product>();
        productCatalogMap.put('A', new Product('A', 50, 0));
        productCatalogMap.put('B', new Product('B', 30, 0));
        productCatalogMap.put('C', new Product('C', 20, 0));
        productCatalogMap.put('D', new Product('D', 15, 0));
        productCatalogMap.put('E', new Product('E', 40, 0));
        productCatalogMap.put('F', new Product('F', 10, 0));
        productCatalogMap.put('G', new Product('G', 20, 0));
        productCatalogMap.put('H', new Product('H', 10, 0));
        productCatalogMap.put('I', new Product('I', 35, 0));
        productCatalogMap.put('J', new Product('J', 60, 0));
        productCatalogMap.put('K', new Product('K', 80, 0));
        productCatalogMap.put('L', new Product('L', 90, 0));
        productCatalogMap.put('M', new Product('M', 15, 0));
        productCatalogMap.put('N', new Product('N', 40, 0));
        productCatalogMap.put('O', new Product('O', 10, 0));
        productCatalogMap.put('P', new Product('P', 50, 0));
        productCatalogMap.put('Q', new Product('Q', 30, 0));
        productCatalogMap.put('R', new Product('R', 50, 0));
        productCatalogMap.put('S', new Product('S', 30, 0));
        productCatalogMap.put('T', new Product('T', 20, 0));
        productCatalogMap.put('U', new Product('U', 40, 0));
        productCatalogMap.put('V', new Product('V', 50, 0));
        productCatalogMap.put('W', new Product('W', 20, 0));
        productCatalogMap.put('X', new Product('X', 90, 0));
        productCatalogMap.put('Y', new Product('Y', 10, 0));
        productCatalogMap.put('Z', new Product('Z', 50, 0));

    }

    public HashMap<Character, Product> getProductCatalogMap() {
        return productCatalogMap;
    }

    public Product getProduct(char productName) {
        return productCatalogMap.get(productName);
    }
}

