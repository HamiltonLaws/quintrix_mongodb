package com.quintrix.springbootMongo.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.quintrix.springbootMongo.documents.User;
import com.quintrix.springbootMongo.service.UserServices;

@RestController
public class UserController {

  @Autowired
  private UserServices service;

  @GetMapping("/users")
  public List<User> getAllUsers() {
    return service.getAllUsers();
  }

  @PostMapping("/users")
  public User saveUser(@RequestBody User user) {
    return service.saveUser(user);
  }


}
