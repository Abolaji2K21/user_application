package africa.semicolon.user_application.dtos.request;


import lombok.Data;

@Data
public class SignupRequest {

    public String email;
    public String password;
    public String confirmPassword;
    public String first_name;
    public String last_name;

}
