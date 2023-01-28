package com.demo.swagger.application.user.service;

import com.demo.swagger.application.user.entity.User;
import com.demo.swagger.application.user.repository.UserRepository;
import com.demo.swagger.application.user.usecase.CreateUserUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CreateUserService implements CreateUserUseCase {
    private final UserRepository userRepository;
    @Override
    public User createUser(User user) {
        return userRepository.createUser(user);
    }
}
