package com.demo.swagger.application.user.service;

import com.demo.swagger.application.user.entity.User;
import com.demo.swagger.application.user.repository.UserRepository;
import com.demo.swagger.application.user.usecase.GetAllUserUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GetAllUserService implements GetAllUserUseCase {
    private final UserRepository userRepository;
    @Override
    public List<User> getAllUser() {
        return userRepository.getAllUsers();
    }
}
