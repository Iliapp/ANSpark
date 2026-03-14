package pl.ANSpark.matchupbackend.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class LoginRequest {

    @Email
    @NotBlank(message = "Can't be empty:")

    private String email;
    @NotBlank(message = "Can't be empty:")
    private String password;
}
