package com.n11.graduationproject.service;


import com.n11.graduationproject.model.User;

import java.util.List;
import java.util.Optional;

public interface IUserService {
    User saveUser(User user);

    Optional<User> findByUsername(String username);

    List<User> findAllUsers();
}
