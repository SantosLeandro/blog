package com.blog.post;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class PostController {
    @Autowired
    PostRepository postRepository;

    @GetMapping("/posts/{id}")
	public String hello(@PathVariable Long id, Model model) {
		Post post = postRepository.findById(id).get();
        model.addAttribute("title", post.getTitle());
        model.addAttribute("content", post.getContent());
        model.addAttribute("username", post.getUser().getName());
        return "post";
	}

    @GetMapping("/posts")
    public List<Post> getPosts(){
        return postRepository.findAll();
    }
     
    
}
