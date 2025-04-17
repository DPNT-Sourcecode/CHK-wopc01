package io.accelerate.solutions.CHK;

public class Product {
    char name;
    int price;
    int amount;

    public Product(char name, int price, int amount) {
        this.name = name;
        this.price = price;
        this.amount = amount;
    }

    public char getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}

