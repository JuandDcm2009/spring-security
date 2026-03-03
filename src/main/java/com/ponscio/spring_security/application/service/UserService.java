package com.ponscio.spring_security.application.service;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.ponscio.spring_security.application.dto.UserRequestDto;
import com.ponscio.spring_security.application.dto.UserResponseDto;
import com.ponscio.spring_security.domain.model.User;
import com.ponscio.spring_security.domain.port.UserRepository;
import com.ponscio.spring_security.infrastructure.persistence.mappers.UserMapper;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class UserService {
    private final UserRepository repository;
    private final UserMapper mapper;

    @Transactional
    public UserResponseDto save(UserRequestDto request) {
        User newUser = new User(
            request.name(),
            request.email(),
            request.password()
        );
        System.out.println("============ ///////// ====== ///// \n ======================== ID" + newUser.getId());
        return mapper.toResponse(repository.save(newUser));
    }
}
