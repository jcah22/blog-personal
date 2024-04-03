package com.blog.personalblog.service;

import java.security.InvalidParameterException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blog.personalblog.Entity.CommentEntity;
import com.blog.personalblog.repository.CommentRepository;

@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    private CommentRepository commentRepository;

    @Override
    public Optional<CommentEntity> getCommentById(long id) {
        
        return commentRepository.findById(id);
    }

    @Override
    public void createComment(CommentEntity comment) {
        commentRepository.save(comment);
    }

    @Override
    public void updateCommit(Long id, CommentEntity comment) {
        
        CommentEntity commentDb = getCommentById(id).orElseThrow(()-> new InvalidParameterException("Invalid Comment id"));
        commentDb.setContent(comment.getContent());
        commentRepository.save(commentDb);
    }

    @Override
    public void deleteComment(Long id) {
        commentRepository.deleteById(id);
    }

}
