package com.blog.personalblog.service;

import java.util.List;
import java.util.Optional;

import com.blog.personalblog.Entity.PostEntity;

public interface PostService {

    List<PostEntity> getAllPost();
    Optional<PostEntity> getPostById(Long id);
    List<PostEntity> getPostByUserId(Long userId);
    void cretaedPost(PostEntity post);
    void updatePost(Long id,PostEntity post);
    void deletePostById(Long id);
    List<PostEntity> searchPostByTitle(String title);


}
