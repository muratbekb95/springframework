package com.example.springboothibernateonemanymapping.entity.repository;

import com.example.springboothibernateonemanymapping.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
}
