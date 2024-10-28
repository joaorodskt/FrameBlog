package com.example.FrameBlog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.FrameBlog.models.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long>{


}
