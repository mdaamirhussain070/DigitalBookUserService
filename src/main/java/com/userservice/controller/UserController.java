package com.userservice.controller;

import com.userservice.entity.User;
import com.userservice.service.UserService;
import com.userservice.utility.UserRouting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;
    @PostMapping(value= UserRouting.CREATE_USER)
    public ResponseEntity<User> createUser(@RequestBody User user){
        User user1=userService.createUser(user);
        return new ResponseEntity<>(user1, HttpStatus.CREATED);
    }
    @GetMapping(value = UserRouting.GET_ALL_USER)
    public ResponseEntity<List<User>> getAllUser(){
        List<User> userList=userService.getAllUser();
        return new ResponseEntity<>(userList, HttpStatus.OK);
    }
    @PutMapping(value = UserRouting.UPDATE_USER)
    public ResponseEntity<User> updateUser(@RequestBody User user ){

        User Updateduser=userService.updateUser(user);

        return new ResponseEntity<>(Updateduser, HttpStatus.OK);
        }

}
