package ru.job4j.pojo;

public class ShopDrop {
    public static Product[] delete(Product[] products, int index) {
        for (int i = 0; i < products.length; i++) {
            if (i == index) {
                for (int x = i; x < products.length - 1; x++) {
                    products[x] = products[x + 1];
                }
                products[products.length - 1] = null;
                return products;
            }
        }
        return products;
    }
}
