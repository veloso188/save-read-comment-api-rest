package com.commentapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.commentapp.model.Comment;

@Repository
public interface CommentsRepository extends JpaRepository<Comment, Long>{

}