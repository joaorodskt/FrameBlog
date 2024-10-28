package com.example.FrameBlog.controllers;

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
import com.example.FrameBlog.services.UserService;

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
    private @ResponseBody User get(@RequestParam final Long id){
        return userService.get(id);
    }
	
	@PostMapping(path = "/update")
	private @ResponseBody User update(@RequestParam final Long id, @RequestBody User user) {
		return userService.update(id, user);
	}
	
	@DeleteMapping(path = "delete")
	private void delete(@RequestParam final Long id) {
		userService.delete(id);
	}
	
}
