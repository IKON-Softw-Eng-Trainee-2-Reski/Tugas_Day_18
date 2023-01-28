package com.demo.swagger.application.user.service;

import com.demo.swagger.application.user.entity.User;
import com.demo.swagger.application.user.usecase.GetUserByPhoneUseCase;
import com.demo.swagger.application.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class GetUserByPhoneService implements GetUserByPhoneUseCase {
    private final UserRepository userRepository;
    @Override
    public Optional<User> getUserByPhone(String phone) {
        return userRepository.getUserByPhone(phone);
    }
}
