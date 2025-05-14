package com.jbk.dtos;

public class UserRequestDTO {
    private String email;
    private String password;
    private String role; // JOB_SEEKER or EMPLOYER

    // Getters and Setters
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }
}