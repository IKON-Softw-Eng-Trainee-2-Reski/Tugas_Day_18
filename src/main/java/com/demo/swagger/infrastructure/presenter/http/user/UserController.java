package com.demo.swagger.infrastructure.presenter.http.user;

import com.demo.swagger.application.user.entity.User;
import com.demo.swagger.infrastructure.presenter.http.Response;

import com.demo.swagger.application.user.usecase.CreateUserUseCase;
import com.demo.swagger.application.user.usecase.GetAllUserUseCase;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {
    private final GetAllUserUseCase getAllUserUseCase;
    private final CreateUserUseCase createUserUseCase;
    @GetMapping
    public ResponseEntity<Object> getUsers() {
        log.info("GET /users called");
        Response response = new Response();
        try {
            List<User> users = getAllUserUseCase.getAllUser();
            response.setData(users);
            return response.getResponse();
        } catch (Exception e){
            log.error("GET /users error: " + e.getMessage());
            response.setErrors(e.getMessage());
            return response.getResponse();
        }

    }

    @PostMapping
    public ResponseEntity<Object> createUser(@RequestBody User userEntity){
        log.info("POST /users called");
        Response response = new Response();
        try {
            User user = createUserUseCase.createUser(userEntity);
            response.setData(user);
            return response.getResponse();
        } catch (Exception e){
            log.error("GET /users error: " + e.getMessage());
            response.setErrors(e.getMessage());
            return response.getResponse();
        }

    }
}
