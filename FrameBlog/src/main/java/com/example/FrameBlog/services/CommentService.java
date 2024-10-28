package com.example.FrameBlog.services;

import java.util.List;

import com.example.FrameBlog.models.Comment;

public interface CommentService {

	Comment save(final Comment comment);

	List<Comment> getAll();

	Comment get(final Long id);

	Comment update(final Long id, final Comment comment);

	void delete(final Long id);

}
