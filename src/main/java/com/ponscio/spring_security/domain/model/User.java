package com.ponscio.spring_security.domain.model;

import java.util.UUID;

public class User {
    private UUID id;
    private String name;
    private String email;
    private String password;

    public User() {}

    public User(
        String name,
        String email,
        String password
    ) {
        this.id = UUID.randomUUID();;
        this.name = name;
        this.email = email;
        this.password = password; // Se espera que venga encriptada
    }

    public static User reconstruct(
        String name,
        String email,
        String password
    ) {
        User user = new User();
        user.name = name;
        user.email = email;
        user.password = password; 
        return user;
    }

    public UUID getId() {
        return id;
    }
    public void setId(UUID id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    
}
