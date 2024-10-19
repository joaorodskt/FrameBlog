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

import com.example.FrameBlog.models.Comment;

import services.CommentService;

@RestController
@RequestMapping(path = "/comments")
public class CommentController {

	@Autowired
	private CommentService commentService;
	
	@PostMapping("/save")
	private @ResponseBody Comment save(@RequestBody Comment comment) {
		return commentService.save(comment);	
	}
	
	@GetMapping(path = "/getAll")
	private @ResponseBody List<Comment> getAll(){
		return commentService.getAll();
	}
	
	@GetMapping(path = "/get")
	private @ResponseBody List<Comment> get(@RequestParam final Long id){
		return commentService.getid(id);
	}
	
	@PostMapping(path = "/update")
	private @ResponseBody Comment update(@RequestParam final Long id, @RequestBody Comment comment) {
		return commentService.update(id, comment);
	}
	
	@DeleteMapping(path = "delete")
	private @ResponseBody Comment delete(@RequestParam final Long id) {
		return commentService.delete(id);
	}
	
}
