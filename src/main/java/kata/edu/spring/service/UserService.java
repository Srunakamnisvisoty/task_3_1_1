package kata.edu.spring.service;


import kata.edu.spring.model.User;

import java.util.List;

public interface UserService {

    List<User> getAll();

    User findOne(Long id);

    User save(User user);

    void remove(Long id);
}
