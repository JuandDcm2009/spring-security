package com.ponscio.spring_security.infrastructure.persistence.adapters.in;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ponscio.spring_security.application.dto.UserRequestDto;
import com.ponscio.spring_security.application.dto.UserResponseDto;
import com.ponscio.spring_security.application.service.UserService;

import lombok.RequiredArgsConstructor;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @PostMapping("/save")
    public ResponseEntity<UserResponseDto> save(@RequestBody UserRequestDto entity) {
        return ResponseEntity.ok(userService.save(entity));
    }
    
}
