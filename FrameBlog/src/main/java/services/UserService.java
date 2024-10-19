package services;

import java.util.List;

import com.example.FrameBlog.models.User;

public interface UserService {

	User save(final User user);
	
	List<User> getAll();
	
	List<User> getid(Long id);
	
	User update(Long id, User user);
	
	User delete(Long id);


}
