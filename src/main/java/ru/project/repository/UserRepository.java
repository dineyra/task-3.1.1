package ru.project.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.project.model.User;


@Repository
public interface UserRepository extends CrudRepository<User, Long> {

}
