package ru.project.service;

import ru.project.model.User;

import java.util.List;

public interface UserService {

    List<User> listAll();

    void save(User user);

    void delete(Long id);

    User get(Long id);
}
