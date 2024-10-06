package ru.demo.tradeapp.repository;

import ru.demo.tradeapp.models.Supplier;

public class SupplierDao extends BaseDao<Supplier> {
    public SupplierDao() {
        super(Supplier.class);
    }
}

