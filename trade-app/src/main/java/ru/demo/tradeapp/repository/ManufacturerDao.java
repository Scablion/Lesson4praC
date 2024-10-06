package ru.demo.tradeapp.repository;

import ru.demo.tradeapp.models.Manufacturer;

public class ManufacturerDao extends BaseDao<Manufacturer> {
    public ManufacturerDao() {
        super(Manufacturer.class);
    }
}
