package ru.demo.tradeapp.repository;

import ru.demo.tradeapp.models.Category;

public class CategoryDao extends BaseDao<Category> {
    public CategoryDao() {
        super(Category.class);
    }
}
