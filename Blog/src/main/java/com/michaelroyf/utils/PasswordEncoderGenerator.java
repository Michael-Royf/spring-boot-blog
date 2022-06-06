package com.michaelroyf.utils;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class PasswordEncoderGenerator {
    public static void main(String[] args) {
        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        System.out.println(passwordEncoder.encode("admin"));
       // System.out.println(passwordEncoder.encode("$2a$10$5LX5z3KKns4hcDGtMyLQyeqlfgxm62E6Wo8lO23pp4FCWnpNm3Rde"));
    }
}
