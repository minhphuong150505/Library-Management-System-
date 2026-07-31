package com.phuong.service.impl;

import com.phuong.domain.UserRole;
import com.phuong.modal.User;
import com.phuong.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DataInitializationComponent implements CommandLineRunner {
    @Value("${app.seed.admin.email}")
    private String adminEmail;

    @Value("${app.seed.admin.password}")
    private String adminPassword;

    @Value("${app.seed.admin.name}")
    private String adminName;


    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;



    @Override
    public void run(String... args) {
        initializeAdminUser();
    }

    private void initializeAdminUser() {
		if (userRepository.findByEmail(adminEmail)==null) {
            User adminUser = new User();

            adminUser.setPassword(passwordEncoder.encode(adminPassword));
            adminUser.setFullName(adminName);
            adminUser.setEmail(adminEmail);
            adminUser.setRole(UserRole.ROLE_ADMIN);

            User admin=userRepository.save(adminUser);
        }
    }
}
