package com.blog.personalblog.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.blog.personalblog.Entity.UserEntity;



public interface UserRepository  extends JpaRepository<UserEntity,Long>{


    @Query("select u from UserEntity u where u.username=:username")
    Optional<UserEntity> findByUsername(@Param("username") String username);
    
} 