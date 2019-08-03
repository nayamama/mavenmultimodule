package com.my_java_app.controllers;

import com.my_java_app.domain.UserCommand;
import com.my_java_app.entities.User;

public class UserController {

    User saveUser(UserCommand command){

        return new User();
    }
}
