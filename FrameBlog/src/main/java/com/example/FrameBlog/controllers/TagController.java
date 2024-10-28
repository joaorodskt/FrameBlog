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

import com.example.FrameBlog.models.Tag;
import com.example.FrameBlog.services.TagService;

@RestController
@RequestMapping(path = "/tags")
public class TagController {

	@Autowired
	private TagService tagService;
	
	@PostMapping("/save")
	private @ResponseBody Tag save(@RequestBody Tag tag) {
		return tagService.save(tag);	
	}
	
	@GetMapping(path = "/getAll")
	private @ResponseBody List<Tag> getAll(){
		return tagService.getAll();
	}
	
	@GetMapping(path = "/get")
	private @ResponseBody Tag get(@RequestParam final Long id){
		return tagService.get(id);
	}
	
	@PostMapping(path = "/update")
	private @ResponseBody Tag update(@RequestParam final Long id, @RequestBody Tag tag) {
		return tagService.update(id, tag);
	}
	
	@DeleteMapping(path = "delete")
	private void delete(@RequestParam final Long id) {
		tagService.delete(id);
	}
	
}
