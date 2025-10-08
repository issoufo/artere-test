package org.arteretest.com;

import org.arteretest.com.userstory1.Category;
import org.arteretest.com.userstory1.Product;

import java.util.Objects;

public final class Utils {

    private Utils() {}

    public static void checkNullCategory(Category category) {
        if (Objects.isNull(category)) {
            throw new IllegalArgumentException("Category cannot be null");
        }
    }

    public static void checkNullProduct(Product product) {
        if (product == null) {
            throw new IllegalArgumentException("Product cannot be null");
        }
    }
}
