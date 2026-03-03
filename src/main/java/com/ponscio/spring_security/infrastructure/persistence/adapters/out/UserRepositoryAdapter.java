package com.ponscio.spring_security.infrastructure.persistence.adapters.out;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Component;

import com.ponscio.spring_security.domain.model.User;
import com.ponscio.spring_security.domain.port.UserRepository;
import com.ponscio.spring_security.infrastructure.persistence.mappers.UserMapper;
import com.ponscio.spring_security.infrastructure.persistence.repository.UserJpaRepository;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class UserRepositoryAdapter implements UserRepository {
    private final UserMapper userMapper;
    private final UserJpaRepository repository;

    @Override
    public List<User> findAll() {
        return repository.findAll().stream().map(userMapper::toDomain).toList();
    }

    @Override
    public Optional<User> findById(UUID id) {
        return repository.findById(id).map(userMapper::toDomain);
    }

    @Override
    public Optional<User> findByEmail(String email) {
        return repository.findByEmail(email).map(userMapper::toDomain);
    }

    @Override
    public User save(User user) {
        return userMapper.toDomain(repository.save(userMapper.toEntity(user)));
    }

    @Override
    public void deleteById(UUID id) {
        repository.deleteById(id);
    }
    
}
