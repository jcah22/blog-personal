package com.blog.personalblog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blog.personalblog.Entity.PostEntity;

public interface PostRepository extends JpaRepository<PostEntity,Long>{

}
