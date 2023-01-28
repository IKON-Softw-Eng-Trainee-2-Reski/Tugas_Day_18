package com.demo.swagger.application.user.usecase;

import com.demo.swagger.application.user.entity.User;

import java.util.List;

public interface GetAllUserUseCase {
    List<User> getAllUser();
}
