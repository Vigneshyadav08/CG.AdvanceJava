package in.cg.main.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import in.cg.main.entities.User;
import java.util.List;


public interface UserRepoInterface extends JpaRepository<User, Long>{
	public User findByUsername(String username);
}
