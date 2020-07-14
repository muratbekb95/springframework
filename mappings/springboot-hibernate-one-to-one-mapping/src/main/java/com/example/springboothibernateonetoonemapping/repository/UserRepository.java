package com.example.springboothibernateonetoonemapping.repository;

import com.example.springboothibernateonetoonemapping.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
