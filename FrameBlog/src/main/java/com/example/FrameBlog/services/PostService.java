package com.example.FrameBlog.services;

import java.util.List;

import com.example.FrameBlog.models.Post;

public interface PostService {

	Post save(final Post post);

	List<Post> getAll();

	Post get(final Long id);

	Post update(final Long id, final Post post);

	void delete(final Long id);

}
