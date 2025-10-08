package org.arteretest.com.userstory1;

import java.util.List;

import static org.arteretest.com.Utils.checkNullCategory;

public record Catalog(List<Category> categories) {

    public boolean addCategory(Category category) {
        checkNullCategory(category);

        return categories.add(category);
    }

    public boolean removeCategory(Category category) {
        checkNullCategory(category);
        return categories.remove(category);
    }
}
