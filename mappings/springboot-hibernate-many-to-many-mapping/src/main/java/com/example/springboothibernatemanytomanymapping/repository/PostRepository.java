package com.example.springboothibernatemanytomanymapping.repository;

import com.example.springboothibernatemanytomanymapping.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
}
