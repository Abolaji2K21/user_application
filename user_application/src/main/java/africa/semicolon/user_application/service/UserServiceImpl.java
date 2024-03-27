package africa.semicolon.user_application.service;

import africa.semicolon.user_application.dtos.request.SignupRequest;
import africa.semicolon.user_application.entity.Role;
import africa.semicolon.user_application.entity.User;
import africa.semicolon.user_application.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
//@AllArgsConstructor
public class UserServiceImpl implements UserService {

//    private final PasswordEncoder passWordEncoder = new BCryptPasswordEncoder();

    @Autowired
    private UserRepository userRepository;
    @Override
    public void RegisterUser(SignupRequest sigUpRequest) {
        User user = new User();
        user.setLast_name(sigUpRequest.getLast_name());
        user.setFirst_name(sigUpRequest.getFirst_name());
        user.setEmail(sigUpRequest.getEmail());
        user.setPassword(sigUpRequest.getPassword());
        user.setRole(Role.ADMIN);
        userRepository.save(user);

    }


    @Override
    public List<User> getUsers() {
        return null;
    }

    @Override
    public User getUserById(int id) {
        return null;
    }

    @Override
    public User getUserByName(String name) {
        return null;
    }

    @Override
    public String deleteUser(int id) {
        return null;
    }

    @Override
    public User updateUser(User user) {
        return null;
    }
}
