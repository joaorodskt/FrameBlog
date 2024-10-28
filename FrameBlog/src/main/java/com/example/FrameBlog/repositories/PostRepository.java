package com.example.FrameBlog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.FrameBlog.models.Post;

public interface PostRepository extends JpaRepository<Post, Long>{
	
	
}
