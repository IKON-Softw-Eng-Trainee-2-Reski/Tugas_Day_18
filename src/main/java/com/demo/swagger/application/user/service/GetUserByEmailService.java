package com.demo.swagger.application.user.service;

import com.demo.swagger.application.user.entity.User;
import com.demo.swagger.application.user.repository.UserRepository;
import com.demo.swagger.application.user.usecase.GetUserByEmailUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class GetUserByEmailService implements GetUserByEmailUseCase {
    private final UserRepository userRepository;
    @Override
    public Optional<User> getUserByEmail(String email) {
        return userRepository.getUserByEmail(email);
    }
}
