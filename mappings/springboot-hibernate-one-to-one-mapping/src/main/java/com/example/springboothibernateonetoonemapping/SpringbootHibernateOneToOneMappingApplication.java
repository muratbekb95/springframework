package com.example.springboothibernateonetoonemapping;

import com.example.springboothibernateonetoonemapping.entity.Gender;
import com.example.springboothibernateonetoonemapping.entity.User;
import com.example.springboothibernateonetoonemapping.entity.UserProfile;
import com.example.springboothibernateonetoonemapping.repository.UserProfileRepository;
import com.example.springboothibernateonetoonemapping.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class SpringbootHibernateOneToOneMappingApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootHibernateOneToOneMappingApplication.class, args);
	}

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private UserProfileRepository userProfileRepository;

	@Override
	public void run(String... args) throws Exception {

		// user object
		User user = new User();
		user.setName("Ramesh");
		user.setEmail("ramesh@gmail.com");

		UserProfile userProfile = new UserProfile();
		userProfile.setAddress("Pune");
		userProfile.setBirthOfDate(LocalDate.of(1991, 03, 24));
		userProfile.setGender(Gender.MALE);
		userProfile.setPhoneNumber("1234567899");

		user.setUserProfile(userProfile);
		userProfile.setUser(user);

		userRepository.save(user);
	}
}
