package com.ponscio.spring_security.application.dto;

import jakarta.validation.constraints.NotNull;

public record LoginRequest (
    @NotNull(message = "Email es requerido")
    String email,

    @NotNull(message = "Password es requerido")
    String password
) {}
