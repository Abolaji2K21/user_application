package africa.semicolon.user_application.service;

import africa.semicolon.user_application.dtos.request.SignupRequest;
import africa.semicolon.user_application.entity.User;

import java.util.List;

public interface UserService {

    public void RegisterUser(SignupRequest sigUpRequest);
    public List<User> getUsers();
    public User getUserById(int id);
    public User getUserByName(String name);
    public String deleteUser(int id);
    public User updateUser(User user);
}
