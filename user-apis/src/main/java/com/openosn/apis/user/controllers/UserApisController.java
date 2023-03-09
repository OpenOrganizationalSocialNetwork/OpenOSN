package com.openosn.apis.user.controllers;

import com.openosn.apis.user.model.repositories.UserRepository;
import org.springframework.stereotype.Controller;

@Controller
public class UserApisController {
    private final UserRepository userRepository;

    public UserApisController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
}
