package com.example.springboothibernateonemanymapping;

import com.example.springboothibernateonemanymapping.entity.Comment;
import com.example.springboothibernateonemanymapping.entity.Post;
import com.example.springboothibernateonemanymapping.entity.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootHibernateOneManyMappingApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootHibernateOneManyMappingApplication.class, args);
	}

	@Autowired
	private PostRepository postRepository;

	@Override
	public void run(String... args) throws Exception {
		Post post = new Post("one to many mapping using JPA and Hibernate", "one to many mapping using JPA and Hibernate");

		Comment comment1 = new Comment("Very useful");
		Comment comment2 = new Comment("Informative");
		Comment comment3 = new Comment("Great post");

		post.getComments().add(comment1);
		post.getComments().add(comment2);
		post.getComments().add(comment3);

		this.postRepository.save(post);
	}
}
