package com.blog.personalblog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blog.personalblog.Entity.UserEntity;

public interface UserRepository  extends JpaRepository<UserEntity,Long>{

    
} 