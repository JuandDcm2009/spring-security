package com.ponscio.spring_security.application.dto;

public record UserResponseDto(
    String name,
    String email,
    String password
) {}
