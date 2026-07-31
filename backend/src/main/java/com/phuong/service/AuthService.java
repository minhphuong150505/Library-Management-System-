package com.phuong.service;

import com.phuong.exception.UserException;
import com.phuong.payload.dto.UserDTO;
import com.phuong.payload.response.AuthResponse;



public interface AuthService {
    AuthResponse login(String username, String password) throws UserException;
    AuthResponse signup(UserDTO req) throws UserException;

    void createPasswordResetToken(String email) throws UserException;
    void resetPassword(String token, String newPassword);
}

