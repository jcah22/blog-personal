package com.blog.personalblog.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blog.personalblog.Entity.CommentEntity;

public interface CommentRepository extends JpaRepository<CommentEntity , Long>{

    List<CommentEntity> findByPostId(Long id);

}
