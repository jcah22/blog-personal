package com.blog.personalblog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blog.personalblog.Entity.CommentEntity;

public interface CommentRepository extends JpaRepository<CommentEntity , Long>{

}
