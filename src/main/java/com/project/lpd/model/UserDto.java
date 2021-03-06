package com.project.lpd.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
    private String fullName;
    private String password;
    private String phone;
    private String email;
    private String username;
    private String address;
    private double wallet;
}
