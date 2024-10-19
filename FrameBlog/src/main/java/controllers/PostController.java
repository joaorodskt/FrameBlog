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

import com.example.FrameBlog.models.Post;

import services.PostService;

@RestController
@RequestMapping(path = "/posts")
public class PostController {

	@Autowired
	private PostService postService;
	
	@PostMapping("/save")
	private @ResponseBody Post save(@RequestBody Post post) {
		return postService.save(post);	
	}
	
	@GetMapping(path = "/getAll")
	private @ResponseBody List<Post> getAll(){
		return postService.getAll();
	}
	
	@GetMapping(path = "/get")
	private @ResponseBody List<Post> get(@RequestParam final Long id){
		return postService.getid(id);
	}
	
	@PostMapping(path = "/update")
	private @ResponseBody Post update(@RequestParam final Long id, @RequestBody Post post) {
		return postService.update(id, post);
	}
	
	@DeleteMapping(path = "delete")
	private @ResponseBody Post delete(@RequestParam final Long id) {
		return postService.delete(id);
	}
	
}
