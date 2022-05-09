package com.quintrix.springbootMongo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.quintrix.springbootMongo.documents.User;
import com.quintrix.springbootMongo.repository.UserRepository;

@Service
public class UserServicesImpl implements UserServices {

  @Autowired
  private UserRepository repository;

  @Override
  public List<User> getAllUsers() {
    return repository.findAll();
  }

}
