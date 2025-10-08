package org.arteretest.com.userstory1;

import java.util.List;
import java.util.Objects;

import static org.arteretest.com.Utils.checkNullCategory;
import static org.arteretest.com.Utils.checkNullProduct;

public record Category(String name, String description,
                       List<Product> products, List<Category> categories) {

    public boolean addCategory(Category category) {
        checkNullCategory(category);

        return categories.add(category);
    }

    public boolean removeCategory(Category category) {
        checkNullCategory(category);
        return categories.remove(category);
    }

    public boolean addProduct(Product product) {
        checkNullProduct(product);

        return products.add(product);
    }

    public boolean removeProduct(Product product) {
        checkNullProduct(product);
        return products.remove(product);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Category other)) {
            return false;
        }

        return Objects.equals(name, other.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}
