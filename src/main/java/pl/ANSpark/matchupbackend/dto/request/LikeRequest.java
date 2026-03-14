package pl.ANSpark.matchupbackend.dto.request;


import jakarta.validation.constraints.NotNull;
import lombok.Data;


@Data
public class LikeRequest {

    @NotNull
    private Long toProfileId;


}
