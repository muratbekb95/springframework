package com.example.springboothibernatemanytomanymapping;

import com.example.springboothibernatemanytomanymapping.entity.Post;
import com.example.springboothibernatemanytomanymapping.entity.Tag;
import com.example.springboothibernatemanytomanymapping.repository.PostRepository;
import com.example.springboothibernatemanytomanymapping.repository.TagRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootHibernateManyToManyMappingApplication implements CommandLineRunner {

	@Autowired
	private PostRepository postRepository;

	/*@Autowired when postRepository is saved the tags will be saved in db too, so we do need to declare this field
	private TagRepository tagRepository;*/

	public static void main(String[] args) {
		SpringApplication.run(SpringbootHibernateManyToManyMappingApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Post post = new Post("Hibernate Many to Many Mapping Example with Spring Boot",
				"Hibernate Many to Many Mapping Example with Spring Boot",
				"Hibernate Many to Many Mapping Example with Spring Boot");
		Post post1 = new Post("Hibernate One to Many Mapping Example with Spring Boot",
				"Hibernate One to Many Mapping Example with Spring Boot",
				"Hibernate One to Many Mapping Example with Spring Boot");

		Tag springBoot = new Tag("SpringBoot");
		Tag hibernate = new Tag("Hibernate");

		// add tag references post
		post.getTags().add(springBoot);
		post.getTags().add(hibernate);

		// add post references tag
		springBoot.getPosts().add(post);
		hibernate.getPosts().add(post);

		springBoot.getPosts().add(post1);
		post1.getTags().add(springBoot);

		this.postRepository.save(post);
		this.postRepository.save(post1);
	}
}
