package ru.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.project.model.User;
import ru.project.repository.UserRepository;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository repo;

    @Autowired
    public UserServiceImpl(UserRepository repo) {
        this.repo = repo;
    }
    @Override
    public void save(User user) {
        repo.save(user);
    }
    @Override
    public List<User> listAll() {
        return (List<User>) repo.findAll();
    }
    @Override
    public User get(Long id) {
        return repo.findById(id).get();
    }
    @Override
    public void delete(Long id) {
        repo.deleteById(id);
    }
}
