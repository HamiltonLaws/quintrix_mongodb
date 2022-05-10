package com.quintrix.springbootMongo.service;

import java.util.List;
import com.quintrix.springbootMongo.documents.User;

public interface UserServices {

  List<User> getAllUsers();

  User saveUser(User user);

}
