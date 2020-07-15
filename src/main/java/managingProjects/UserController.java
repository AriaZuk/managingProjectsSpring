package managingProjects;

import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {
    private UserRepository userRepository;
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/user/getAll")
    public Iterable<User> user() {
        return userRepository.findAll();
    }

    @PostMapping("/user/add")
    public void add(@RequestBody User user) {
        userRepository.save(user);
        return;
    }

    @GetMapping("/user/authenticate")
    public boolean authenticate(String username, String password) {
        User valid = userRepository.findByName(username);
        if(password.equals(valid.getPassword())){
            return true;
        }
        else{
            return false;
        }
    }
}
