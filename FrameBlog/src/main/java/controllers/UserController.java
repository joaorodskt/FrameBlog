package controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.FrameBlog.models.User;

import services.UserService;

@RestController
@RequestMapping(path = "/users")
public class UserController {

	@Autowired
	private UserService userService;
	
	@PostMapping("/save")
	private @ResponseBody User save(@RequestBody User user) {
		return userService.save(user);	
	}
	
	@GetMapping(path = "/getAll")
	private @ResponseBody List<User> getAll(){
		return userService.getAll();
	}
	
	@GetMapping(path = "/get")
	private @ResponseBody List<User> get(@RequestParam final Long id){
		return userService.getid(id);
	}
	
	@PostMapping(path = "/update")
	private @ResponseBody User update(@RequestParam final Long id, @RequestBody User user) {
		return userService.update(id, user);
	}
	
	@DeleteMapping(path = "delete")
	private @ResponseBody User delete(@RequestParam final Long id) {
		return userService.delete(id);
	}
	
}
