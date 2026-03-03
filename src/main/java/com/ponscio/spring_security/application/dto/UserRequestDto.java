package com.ponscio.spring_security.application.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

public record UserRequestDto(
    @NotNull(message = "Name es requerido")
    String name,

    @NotNull(message = "Email es requerido")
    @Email(message = "Formato invalido para el atributo Email")
    String email,

    @NotNull(message = "Password es requerido")
    String password
) {}
