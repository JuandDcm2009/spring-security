package com.ponscio.spring_security.infrastructure.security.jwt;

import org.springframework.stereotype.Service;

import com.ponscio.spring_security.application.dto.AuthResponse;
import com.ponscio.spring_security.application.dto.LoginRequest;
import com.ponscio.spring_security.application.dto.RegisterRequest;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AuthService {

    public AuthResponse login(LoginRequest request) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'login'");
    }

    public AuthResponse register(RegisterRequest request) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'login'");
    }

}
