package com.example.oneToOne;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.oneToOne.entity.Gender;
import com.example.oneToOne.entity.User;
import com.example.oneToOne.entity.UserProfile;
import com.example.oneToOne.repository.UserProfileRepository;
import com.example.oneToOne.repository.UserRepository;

@SpringBootApplication
public class SpringbootOneToOneMappingApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootOneToOneMappingApplication.class, args);
	}

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private UserProfileRepository userProfileRepository;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		User user = new User();
		
		user.setName("Hemnath");
		user.setEmail("Hemnath@mail.com");

		UserProfile userProfile = new UserProfile();
		
		userProfile.setPhoneNumber("9876543210");
		userProfile.setAddress("Chennai");
		userProfile.setDateOfBirth(LocalDate.of(1999, 9, 6));
		userProfile.setGender(Gender.MALE);

		user.setUserProfile(userProfile);
		userProfile.setUser(user);
		
		this.userRepository.save(user);

	}

}
