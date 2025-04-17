package io.accelerate.solutions.CHK;

import java.util.HashMap;

import io.accelerate.solutions.CHK.Product;

public class ProductCatalog {
    HashMap<Character, Product> productCatalogMap;

    public Product() {
        productCatalogMap = new HashMap<Character, Product>();
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

    }

    public HashMap<Character, Product> getProductCatalogMap() {
        return productCatalogMap;
    }
}
