package org.arteretest.com.userstory1;

import java.math.BigDecimal;
import java.util.Objects;

public record Product(String name, BigDecimal price, int quantity) {

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Product product)) {
            return false;
        }

        return Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
