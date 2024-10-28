package com.example.FrameBlog.services;

import java.util.List;

import com.example.FrameBlog.models.Tag;

public interface TagService {

	Tag save(final Tag tag);

	List<Tag> getAll();

	Tag get(final Long id);

	Tag update(final Long id, final Tag tag);

	void delete(final Long id);

}
