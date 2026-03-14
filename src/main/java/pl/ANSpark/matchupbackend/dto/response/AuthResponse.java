package pl.ANSpark.matchupbackend.dto.response;

import lombok.Data;


import java.util.UUID;

@Data
public class  AuthResponse {

    private String token;
    private UUID userId;
    private String  email;
    private ProfileResponse profile;

//    public AuthResponse(String token, UUID userId, String email, ProfileResponse profile) {
//        this.token = token;
//        this.userId = userId;
//        this.email = email;
//        this.profile = profile;
//    }



}
