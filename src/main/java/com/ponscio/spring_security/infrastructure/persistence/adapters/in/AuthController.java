package com.ponscio.spring_security.infrastructure.persistence.adapters.in;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ponscio.spring_security.application.dto.AuthResponse;
import com.ponscio.spring_security.application.dto.LoginRequest;
import com.ponscio.spring_security.application.dto.RegisterRequest;
import com.ponscio.spring_security.application.dto.UserResponseDto;
import com.ponscio.spring_security.infrastructure.security.jwt.AuthService;

import lombok.RequiredArgsConstructor;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {
    //private final UserService userService;
    private final AuthService authService;

    @PostMapping("/register")
    public ResponseEntity<UserResponseDto> register(@RequestBody RegisterRequest request) {
        return null;
    }
    
    @PostMapping("/login")
    public ResponseEntity<AuthResponse> login(@RequestBody LoginRequest request) {
        return ResponseEntity.ok(authService.login(request));
    }

}
