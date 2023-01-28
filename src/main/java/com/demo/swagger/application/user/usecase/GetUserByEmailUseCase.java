package com.demo.swagger.application.user.usecase;

import com.demo.swagger.application.user.entity.User;

import java.util.Optional;

public interface GetUserByEmailUseCase {
    Optional<User> getUserByEmail(String email);
}
