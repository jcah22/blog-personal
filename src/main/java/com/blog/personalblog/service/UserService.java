package com.blog.personalblog.service;

import java.util.Optional;

import com.blog.personalblog.Entity.UserEntity;

public interface UserService {

    void createuser(UserEntity user);
    Optional<UserEntity> getUserById(Long id);
    Optional<UserEntity> getUserByUsername(String username);


}
