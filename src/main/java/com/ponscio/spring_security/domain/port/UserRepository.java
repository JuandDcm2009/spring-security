package com.ponscio.spring_security.domain.port;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.ponscio.spring_security.domain.model.User;

public interface UserRepository {
    List<User> findAll();
    Optional<User> findById(UUID id);
    Optional<User> findByEmail(String email);
    User save(User user);
    void deleteById(UUID id);
}
