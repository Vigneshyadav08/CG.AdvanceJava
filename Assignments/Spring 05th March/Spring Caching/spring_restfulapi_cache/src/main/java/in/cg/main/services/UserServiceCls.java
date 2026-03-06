package in.cg.main.services;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import in.cg.main.dto.UserDTO;
import in.cg.main.entities.User;
import in.cg.main.repositories.UserRepository;

@Service
public class UserServiceCls implements UserService{

	@Autowired
	UserRepository ur;
	
	@Override
	@CacheEvict(value = {"users","usersList"},allEntries = true)
	public UserDTO createUser(UserDTO dto) {
		if(ur.existsByEmail(dto.getEmail()))
			throw new RuntimeException("email alreadys exists");
		
		User user = new User();
		user.setName(dto.getName());
		user.setEmail(dto.getEmail());
		user.setCity(dto.getCity());
		
		User savedUser = ur.save(user);
		
		// Setting Id 
		dto.setId(savedUser.getId());
		
		return dto;
	}

	@Cacheable(value = "usersList")
	@Override
	public List<UserDTO> getAllUsers() {
		System.out.println("Fetching all users from db");
		List<User> users  = ur.findAll();
		List<UserDTO> dto = new ArrayList<>();
		for(User user:users)
		{
			UserDTO dto1 = new UserDTO();
			dto1.setId(user.getId());
			dto1.setName(user.getName());
			dto1.setCity(user.getCity());
			dto1.setEmail(user.getEmail());
			dto.add(dto1);
		}
		return dto;
	}

	@Cacheable(value = "user",key = "#id")
	@Override
	public UserDTO getUserById(int id) {
		System.out.println("fetching from db where id is "+id);
		User user = ur.findById(id)
				.orElseThrow(()-> new RuntimeException("User Not found"));
		
		UserDTO dto = new UserDTO();
		dto.setId(user.getId());
		dto.setName(user.getName());
		dto.setCity(user.getCity());
		dto.setEmail(user.getEmail());
		
		return dto;
	}

	@Override
	@CacheEvict(value = {"users","usersList"},allEntries = true)
	public UserDTO updateUser(int id, UserDTO dto) {
		User user = ur.findById(id).orElse(null);
		ModelMapper modelMapper =new ModelMapper();
		modelMapper.map(dto,user);
		User user1= ur.save(user);
		return modelMapper.map(user1, UserDTO.class);
	}
}
