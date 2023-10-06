package uz.maktab.IT.maktabIT;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;
import uz.maktab.IT.maktabIT.repository.UserRepository;

@SpringBootApplication
public class MaktabItApplication {

	public static void main(String[] args) {
		SpringApplication.run(MaktabItApplication.class, args);

//		@Autowired
//		UserRepository userRepository;
//
//		@Autowired
//		PasswordEncoder encoder;
//
//		@Override
//		public void run (ApplicationArguments args) throws Exception {
//
//			Optional<User> us = userRepository.findByLogin("admin123");
//
//			if (!us.isPresent()) {
//				User u = new User();
//				u.setIsm("Bunyid");
//				u.setFamiliya("Mirxalilov");
//				u.setLogin("admin12345");
//				u.setParol(encoder.encode("admin12345"));
//				u.setActive(true);
////			u.setLavozims(Set.o);
//				userRepository.save(u);
//
//			}
//		}

	}}
