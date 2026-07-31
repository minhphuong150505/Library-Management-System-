package com.phuong.service;


import com.phuong.domain.UserRole;
import com.phuong.exception.UserException;
import com.phuong.modal.User;
import com.phuong.payload.dto.UserDTO;

import java.util.List;
import java.util.Set;
//import com.phuong.payload.request.UpdateUserDto;


public interface UserService {
	User getUserByEmail(String email) throws UserException;
	User getUserFromJwtToken(String jwt) throws UserException;
	User getUserById(Long id) throws UserException;
	Set<User> getUserByRole(UserRole role) throws UserException;
	List<User> getUsers() throws UserException;
	User getCurrentUser() throws UserException;



	/**
	 * Get total count of all registered users (Admin only)
	 */
	long getTotalUserCount();
}

