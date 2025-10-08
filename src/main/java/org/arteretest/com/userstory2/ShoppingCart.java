package org.arteretest.com.userstory2;

import org.arteretest.com.userstory1.Product;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.arteretest.com.Utils.checkNullProduct;

public class ShoppingCart {

    private final List<Product> products = new ArrayList<>();

    private Double totalPrice;

    public double addProduct(Product product) {
        checkNullProduct(product);
        products.add(product);

        if (products.size() == 1) {
            totalPrice = total();
            return totalPrice;
        }

        totalPrice = totalPrice + product.price().doubleValue();
        return totalPrice;
    }

    public double removeProduct(Product product) {
        if (products.isEmpty()) {
            return 0;
        }

        checkNullProduct(product);
        products.remove(product);
        totalPrice = totalPrice - product.price().doubleValue();

        return totalPrice;
    }

    public double update(Product oldProduct, Product newProduct) {
        if (oldProduct.equals(newProduct)) {
            return totalPrice;
        }

        removeProduct(oldProduct);
        return addProduct(newProduct);
    }

    private double total() {
       return products.stream()
                .map(Product::price)
                .mapToDouble(BigDecimal::doubleValue)
                .sum();
    }
}
