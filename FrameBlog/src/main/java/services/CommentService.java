package services;

import java.util.List;

import com.example.FrameBlog.models.Comment;

public interface CommentService {

	Comment save(Comment comment);

	List<Comment> getAll();

	List<Comment> getid(Long id);

	Comment update(Long id, Comment comment);

	Comment delete(Long id);

}
