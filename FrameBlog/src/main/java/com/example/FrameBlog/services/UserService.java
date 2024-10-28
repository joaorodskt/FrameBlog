package com.example.FrameBlog.services;

import java.util.List;

import com.example.FrameBlog.models.User;

public interface UserService {

	User save(final User user);

	List<User> getAll();

	User get(final Long id);

	User update(final Long id, final User user);

	void delete(final Long id);

}
