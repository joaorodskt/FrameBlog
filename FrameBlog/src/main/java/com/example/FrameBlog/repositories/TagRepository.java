package com.example.FrameBlog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.FrameBlog.models.Tag;

public interface TagRepository extends JpaRepository<Tag, Long> {


}
