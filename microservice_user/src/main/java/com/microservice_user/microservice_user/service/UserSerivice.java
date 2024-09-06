package com.microservice_user.microservice_user.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.microservice_user.microservice_user.dto.UserDto;

@Service
public class UserSerivice {

    public List<UserDto> getUsers(){
        UserDto user = new UserDto();
        user.setName("erick");
        user.setEmail("erick@btilab.co");

        List<UserDto> users = new ArrayList<>();
        users.add(user);
        return users;

    }
}
