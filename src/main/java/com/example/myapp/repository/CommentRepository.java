package com.example.myapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.myapp.model.Comment;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long>{

  
}
