package services;

import java.util.List;

import com.example.FrameBlog.models.Tag;

public interface TagService {

	Tag save(Tag tag);

	List<Tag> getAll();

	List<Tag> getid(Long id);

	Tag update(Long id, Tag tag);

	Tag delete(Long id);

}
