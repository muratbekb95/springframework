package com.example.springsecuritydatabaseauthenticationexample;

import com.example.springsecuritydatabaseauthenticationexample.model.User;
import com.example.springsecuritydatabaseauthenticationexample.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class SpringSecurityDatabaseAuthenticationExampleApplication implements CommandLineRunner {

	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	@Autowired
	private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityDatabaseAuthenticationExampleApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		userRepository.save(new User("baurzhan", bCryptPasswordEncoder.encode("baurzhan")));
	}
}
