package com.ponscio.spring_security.infrastructure.persistence.mappers;

import org.springframework.stereotype.Component;

import com.ponscio.spring_security.application.dto.UserRequestDto;
import com.ponscio.spring_security.application.dto.UserResponseDto;
import com.ponscio.spring_security.domain.model.User;
import com.ponscio.spring_security.infrastructure.persistence.entity.UserEntity;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class UserMapper {
    
    public UserEntity toEntity(User domain) {
        return new UserEntity(
            domain.getId(),
            domain.getName(),
            domain.getEmail(),
            domain.getPassword()
        );
    }

    public User toDomain(UserEntity entity) {
        User newUser = new User();
        newUser.setId(entity.getId());
        newUser.setName(entity.getName());
        newUser.setEmail(entity.getEmail());
        newUser.setPassword(entity.getPassword());
        return newUser;
    }   

    public UserResponseDto toResponse(User user) {
        return new UserResponseDto(
            user.getName(),
            user.getEmail(),
            user.getPassword()
        );
    } 

    public UserRequestDto toRequest(User user) {
        return new UserRequestDto(
            user.getName(),
            user.getEmail(),
            user.getPassword()
        );
    } 

}
