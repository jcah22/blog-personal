package com.blog.personalblog.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blog.personalblog.Entity.UserEntity;
import com.blog.personalblog.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;


    @Override
    public void createuser(UserEntity user) {
        userRepository.save(user);
        
    }

    @Override
    public Optional<UserEntity> getUserById(Long id) {

       return userRepository.findById(id);
    }

    @Override
    public Optional<UserEntity> getUserByUsername(String username) {
        
        return userRepository.findByUsername(username);
    }

}
