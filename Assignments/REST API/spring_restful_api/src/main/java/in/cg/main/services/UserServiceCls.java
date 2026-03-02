package in.cg.main.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.cg.main.entities.User;
import in.cg.main.repositories.UserRepository;

@Service
public class UserServiceCls implements UserService{

	@Autowired
	UserRepository ur;
	@Override
	public User addUser(User user) {
		try {
			ur.save(user);
			return user;
		}catch(Exception e)
		{
			return null;
		}
	}

	@Override
	public User getUserDetails(int id) {
		return ur.findById(id).get();
	}

	@Override
	public List<User> getAllUsers() {
		return ur.findAll();
	}

	@Override
	public User updateUser(int id,User userUpd) {
		User user = ur.findById(id).get();
		
		if(userUpd.getCity()!=null)
			user.setCity(userUpd.getCity());
		else if(userUpd.getName()!=null)
			user.setCity(userUpd.getName());
		else if(userUpd.getEmail()!=null)
			user.setEmail(userUpd.getEmail());
		
		try {
			ur.save(user);
			return user;
		}catch(Exception e)
		{
			return null;
		}
	}

	@Override
	public boolean deleteUser(int id) {
		try {
			ur.deleteById(id);
			return true;
		}catch(Exception e)
		{
			return false;
		}
	}

}
