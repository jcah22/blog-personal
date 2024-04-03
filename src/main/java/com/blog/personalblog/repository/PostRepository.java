package com.blog.personalblog.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blog.personalblog.Entity.PostEntity;

public interface PostRepository extends JpaRepository<PostEntity,Long>{

    List<PostEntity> findByUserId(Long id);
    List<PostEntity> findByTitleContainingIgnoreCase(String title);
    



}
