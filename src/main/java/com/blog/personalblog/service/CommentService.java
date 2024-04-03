package com.blog.personalblog.service;

import java.util.Optional;

import com.blog.personalblog.Entity.CommentEntity;

public interface CommentService {

    Optional<CommentEntity> getCommentById(long id);
    void createComment(CommentEntity comment);
    void updateCommit(Long id,CommentEntity comment);
    void deleteComment(Long id);

}
