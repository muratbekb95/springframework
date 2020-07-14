package com.example.springboothibernateonetoonemapping.repository;

import com.example.springboothibernateonetoonemapping.entity.UserProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserProfileRepository extends JpaRepository<UserProfile, Long> {
}
