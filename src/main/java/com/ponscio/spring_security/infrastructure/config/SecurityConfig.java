package com.ponscio.spring_security.infrastructure.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

import lombok.RequiredArgsConstructor;

@Configuration // Gestiona varios beans de configuracion
@EnableWebSecurity 
@RequiredArgsConstructor
public class SecurityConfig {
 
    @Bean 
    public SecurityFilterChain securityFilterChain(HttpSecurity http) {
        return http
            .csrf(csrf -> csrf.disable()) // Hasta donde se es para solo trabajar seguridad basada en tokens
            .authorizeHttpRequests(authRequest -> 
                authRequest
                .requestMatchers("/users/**").permitAll()
                .anyRequest().authenticated()
            )
            //.formLogin(withDefaults())
            .build();
    }
}
