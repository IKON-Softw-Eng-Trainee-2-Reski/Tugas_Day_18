package com.demo.swagger.application.user.usecase;

import com.demo.swagger.application.user.entity.User;

import java.util.Optional;

public interface GetUserByPhoneUseCase {
    Optional<User> getUserByPhone(String phone);
}
