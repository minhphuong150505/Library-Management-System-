package com.phuong.repository;


import com.phuong.domain.UserRole;
import com.phuong.modal.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);
    Set<User> findByRole(UserRole role);
}

