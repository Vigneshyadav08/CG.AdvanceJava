package in.cg.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import in.cg.main.dto.UserDTO;
import in.cg.main.services.FileStorageService;
import in.cg.main.services.UserService;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/users")
public class UserController {
	@Autowired
	private UserService us;
	
	@Autowired
	FileStorageService fileService;
	
	@PostMapping
	public UserDTO createUser(@Valid @RequestBody UserDTO dto)
	{
		return us.createUser(dto);
	}
	
	@GetMapping
	public List<UserDTO> getAllUsers()
	{
		return us.getAllUsers();
	}
	
	@GetMapping("/{id}")
	public UserDTO getUser(@PathVariable int id)
	{
		return us.getUserById(id);
	}
	
	@PutMapping("/{id}")
	public UserDTO updateUser(@PathVariable int id,@RequestBody UserDTO dto)
	{
		return us.updateUser(id,dto);
	}
	@PostMapping(value = "/upload", consumes = "multipart/form-data")
	public String uploadFile(@RequestParam("file") MultipartFile file) {
		return fileService.uploadFile(file);
	}

	@GetMapping("/download/{filename}")
	public ResponseEntity<Resource> downloadFile(@PathVariable String filename) {

		Resource resource = fileService.downloadFile(filename);

		return ResponseEntity.ok()
				.contentType(MediaType.APPLICATION_OCTET_STREAM)
				.header("Content-Disposition", "attachment; filename=\"" + resource.getFilename() + "\"")
				.body(resource);
	}
}
