package in.cg.main.services;

import java.util.List;

import org.springframework.stereotype.Service;

import in.cg.main.entities.User;

@Service
public interface UserService {
	public User addUser(User user);
	public User getUserDetails(int id);
	public List<User> getAllUsers();
	public User updateUser(int id,User user);
	public boolean deleteUser(int id);
}
