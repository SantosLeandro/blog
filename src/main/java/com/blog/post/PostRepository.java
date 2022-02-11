package com.blog.post;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface PostRepository extends JpaRepository<Post, Long>{
	Post findById(long id);
}