package com.example.springboothibernateonemanymapping.entity.repository;

import com.example.springboothibernateonemanymapping.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
}
