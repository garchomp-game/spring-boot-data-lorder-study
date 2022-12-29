package com.example.myapp.config;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.example.myapp.model.Comment;
import com.example.myapp.repository.CommentRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Component
public class DataLoader implements ApplicationRunner {

  private final CommentRepository repository;

  @Override
  public void run(ApplicationArguments args) throws Exception {
    Comment comment = new Comment();
    comment.setContent("こんにちは");
    repository.save(comment);

    Comment testComment = new Comment();
    testComment.setContent("テストコメント");
    repository.save(testComment);
  }
}
