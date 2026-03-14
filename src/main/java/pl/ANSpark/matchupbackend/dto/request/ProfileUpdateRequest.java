package pl.ANSpark.matchupbackend.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import pl.ANSpark.matchupbackend.model.PreferenceEnum;

@Data
public class ProfileUpdateRequest {

    private String displayName;

    private String bio;

    private String city;

    private PreferenceEnum preference;

    private Double latitude;

    private Double longitude;




}
