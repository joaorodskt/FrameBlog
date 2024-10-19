package services;

import java.util.List;

import com.example.FrameBlog.models.Post;

public interface PostService {

	Post save(Post post);

	List<Post> getAll();

	List<Post> getid(Long id);

	Post update(Long id, Post post);

	Post delete(Long id);

}
