package in.cg.main.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import in.cg.main.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	  Optional<User> findByEmail(String email);
}
