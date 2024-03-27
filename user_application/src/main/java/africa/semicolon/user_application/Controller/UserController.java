package africa.semicolon.user_application.Controller;

import africa.semicolon.user_application.dtos.request.SignupRequest;
import africa.semicolon.user_application.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping("/api/v1/user_controller")
public class UserController {

    @Autowired
    private UserService userService;


    private  SignupRequest signupRequest;


    @PostMapping("/signup")
    public String signUp(@RequestBody SignupRequest signupRequest) {
        userService.RegisterUser(signupRequest);
        return "Success";

    }
}
