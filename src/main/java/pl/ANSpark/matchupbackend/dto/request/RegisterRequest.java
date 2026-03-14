package pl.ANSpark.matchupbackend.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import pl.ANSpark.matchupbackend.model.GenderEnum;
import pl.ANSpark.matchupbackend.model.PreferenceEnum;

import java.time.LocalDate;

@Data
public class RegisterRequest {

    @NotBlank(message = "Can't be empty:")
    @Email
    private String email;


    @Size(min = 8)
    @NotBlank(message = "Can't be empty:")
    private String password;

    @NotBlank(message = "Can't be empty:")
    private String displayName;

    @NotNull(message = "Can't be empty:")
    private LocalDate birthDate;

    @NotNull(message = "Can't be empty:")
    private GenderEnum gender;

    @NotNull(message = "Can't be empty:")
    private PreferenceEnum preference;






}
