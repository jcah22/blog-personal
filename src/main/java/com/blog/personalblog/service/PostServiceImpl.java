package com.blog.personalblog.service;

import java.security.InvalidParameterException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blog.personalblog.Entity.PostEntity;
import com.blog.personalblog.repository.PostRepository;

@Service
public class PostServiceImpl implements PostService{

    @Autowired
    private PostRepository postRepository;

    @Override
    public List<PostEntity> getAllPost() {
        return postRepository.findAll();
    }

    @Override
    public Optional<PostEntity> getPostById(Long id) {
        
      return postRepository.findById(id);
    }

    @Override
    public List<PostEntity> getPostByUserId(Long userId) {
        return postRepository.findByUserId(userId);
    }

    @Override
    public void cretaedPost(PostEntity post) {
        postRepository.save(post);
    }

    @Override
    public void updatePost(Long id, PostEntity post) {
        
        PostEntity postDb = getPostById(id).orElseThrow(() -> new InvalidParameterException("Invalid post id"));
        postDb.setTitle(post.getTitle());
        postDb.setContent(post.getContent());
        postRepository.save(postDb);

    }

    @Override
    public void deletePostById(Long id) {
       postRepository.deleteById(id);
    }

    @Override
    public List<PostEntity> searchPostByTitle(String title) {
        return postRepository.findByTitleContainingIgnoreCase(title);
    }

}
