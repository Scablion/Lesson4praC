package ru.demo.tradeapp.repository;

import ru.demo.tradeapp.models.User;

public class UserDao extends BaseDao<User> {
    public UserDao() {
        super(User.class);
    }
}
