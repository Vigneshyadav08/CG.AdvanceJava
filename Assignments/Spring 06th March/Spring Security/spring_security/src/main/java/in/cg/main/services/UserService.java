package in.cg.main.services;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import in.cg.main.dto.UserDTO;

@Service
public interface UserService extends UserDetailsService{
	public String registerUser(UserDTO dto);
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException;
	public String deleteUser(Long id);
}
