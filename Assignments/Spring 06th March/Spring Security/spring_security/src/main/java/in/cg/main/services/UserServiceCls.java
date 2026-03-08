package in.cg.main.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import in.cg.main.dto.UserDTO;
import in.cg.main.entities.User;
import in.cg.main.repositories.UserRepoInterface;

@Service
public class UserServiceCls implements UserService{
	
	private final UserRepoInterface userRepostiory;
	private final PasswordEncoder passEncoder;
	public UserServiceCls(UserRepoInterface userReposiory,PasswordEncoder passEncoder) {
		this.userRepostiory = userReposiory;
		this.passEncoder = passEncoder;
	}
	
	
	@Override
	public String registerUser(UserDTO dto) {
		User user = new User();
		user.setUsername(dto.getUsername());
		user.setPassword(passEncoder.encode(dto.getPassword()));
		user.setRole(dto.getRole());
		userRepostiory.save(user);
		return "User Registered successfully";
	}


	// File: UserServiceCls.java

	@Override
	public UserDetails loadUserByUsername(String username)
	        throws UsernameNotFoundException {

	    User user = userRepostiory.findByUsername(username);

	    return new org.springframework.security.core.userdetails.User(
	            user.getUsername(),
	            user.getPassword(),
	            List.of(new SimpleGrantedAuthority("ROLE_" + user.getRole()))
	    );
	}


	@Override
	@PreAuthorize("hasRole('ADMIN')")
	public String deleteUser(Long id) {
		userRepostiory.deleteById(id);
		return "User deleted successfully";
	}
	
}
